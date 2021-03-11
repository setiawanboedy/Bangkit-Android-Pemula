package com.tafakkur.animeapp.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.transform.BlurTransformation
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tafakkur.animeapp.R
import com.tafakkur.animeapp.utils.Constants
import kotlinx.android.synthetic.main.activity_detail_anime.*

class DetailAnime : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_anime)

        supportActionBar?.title = "Detail Anime"

        val title = intent.getStringExtra(Constants.TITLE)
        val release = intent.getStringExtra(Constants.RELEASE)
        val sinopsis = intent.getStringExtra(Constants.SINOPSIS)
        val poster = intent.getIntExtra(Constants.POSTER,null?: 0)

        detailShow(title,release,sinopsis,poster)
        buttonShare(title,release,sinopsis)
    }

    private fun detailShow(
        title: String?,
        release: String?,
        sinopsis: String?,
        poster: Int
    ) {
        titleDetail.text = title
        releaseDetail.text = release
        sinopsisDetail.text = sinopsis

        imgDetailBg.load(poster){
            transformations(BlurTransformation(this@DetailAnime))
        }

        Glide.with(this)
            .load(poster)
            .apply(RequestOptions.overrideOf(400,564))
            .into(imgDetail)
    }

    private fun buttonShare(
        title: String?,
        release: String?,
        sinopsis: String?
    ) {
        val message = """
                Title: $title
                Release Date: $release
                Sinopsis: $sinopsis
            """.trimIndent()

        btnShare.setOnClickListener {
            val intentShare = Intent(Intent.ACTION_SEND)
            intentShare.type = "text/plain"
            intentShare.putExtra(Intent.EXTRA_SUBJECT,"Anime App")
            intentShare.putExtra(Intent.EXTRA_TEXT,message)
            startActivity(Intent.createChooser(intentShare,"Share to:"))
        }
    }
}