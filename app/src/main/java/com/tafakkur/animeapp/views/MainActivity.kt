package com.tafakkur.animeapp.views

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.tafakkur.animeapp.R
import com.tafakkur.animeapp.adapter.AnimeAdapter
import com.tafakkur.animeapp.data.Anime
import com.tafakkur.animeapp.item.DataAnime
import com.tafakkur.animeapp.utils.Constants
import com.tafakkur.animeapp.utils.OnItemClickCallback
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.animeitem.*

class MainActivity : AppCompatActivity() {

    var listAnime: ArrayList<Anime> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animeRecycler.setHasFixedSize(true)
        listAnime.addAll(DataAnime.listData)
        recyclerViewShow()
    }

    private fun recyclerViewShow() {
        animeRecycler.layoutManager = LinearLayoutManager(this)
        val animAdapter = AnimeAdapter(listAnime)
        animeRecycler.adapter = animAdapter

        animAdapter.setOnItemClickCallback(object : OnItemClickCallback{
            override fun onItemClicked(data: Anime) {
                detailSelected(data)
            }
        })
    }

    private fun detailSelected(data: Anime) {
        val detailIntent = Intent(this@MainActivity, DetailAnime::class.java)
        val options = ActivityOptions.makeSceneTransitionAnimation(this, imgPoster, "transition")
        detailIntent.putExtra(Constants.TITLE, data.title)
        detailIntent.putExtra(Constants.SINOPSIS, data.sinopsis)
        detailIntent.putExtra(Constants.RELEASE, data.releaseDate)
        detailIntent.putExtra(Constants.POSTER, data.poster)
        startActivity(detailIntent, options.toBundle())
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        aboutShow(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun aboutShow(item: Int) {
        when (item) {
            R.id.about -> {
                aboutSelected()
            }
        }
    }

    private fun aboutSelected() {
        val options = ActivityOptions.makeSceneTransitionAnimation(this, imgPoster, "transition")
        val intentAbout = Intent(this@MainActivity, About::class.java)
        startActivity(intentAbout, options.toBundle())
    }
}