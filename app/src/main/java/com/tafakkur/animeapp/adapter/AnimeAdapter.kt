package com.tafakkur.animeapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tafakkur.animeapp.R
import com.tafakkur.animeapp.data.Anime
import com.tafakkur.animeapp.utils.OnItemClickCallback
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.animeitem.view.*

class AnimeAdapter(private val listAnime: ArrayList<Anime>): RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>(){

    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class AnimeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var title = itemView.titleName
        var desc = itemView.description
        var imgPoster = itemView.imgPoster
        var release = itemView.release
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AnimeAdapter.AnimeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.animeitem, parent, false)
        return AnimeViewHolder(view)
    }

    override fun getItemCount(): Int = listAnime.size

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        val anime = listAnime[position]
        Glide.with(holder.itemView.context)
            .load(anime.poster)
            .apply(RequestOptions.overrideOf(55,77))
            .into(holder.imgPoster)

        holder.title.text = anime.title
        holder.desc.text = anime.sinopsis
        holder.release.text = anime.releaseDate

        //clicked
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listAnime[holder.absoluteAdapterPosition])
        }
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

}