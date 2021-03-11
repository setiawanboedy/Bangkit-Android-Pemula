package com.tafakkur.animeapp.utils

import com.tafakkur.animeapp.data.Anime

interface OnItemClickCallback {
    fun onItemClicked(data: Anime)
}