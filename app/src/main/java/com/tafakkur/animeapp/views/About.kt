package com.tafakkur.animeapp.views

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tafakkur.animeapp.R
import kotlinx.android.synthetic.main.activity_about.*

class About : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.title = "About"

        sosmed.setOnClickListener(this)
        visClose.setOnClickListener(this)
        btnfb.setOnClickListener(this)
        btnLinkedin.setOnClickListener(this)
        btnWhatsapp.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.sosmed -> {
                sosmed.visibility = View.GONE
                visClose.visibility = View.VISIBLE
                visSosmed.apply {
                    visibility = View.VISIBLE
                }
            }
            R.id.visClose -> {
                visClose.visibility = View.GONE
                sosmed.visibility = View.VISIBLE
                visSosmed.apply {
                    visibility = View.GONE
                }
            }
            R.id.btnfb -> {
                val intentFbWeb = Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/r3nd1.s1n4g4/"))
                startActivity(intentFbWeb)
            }
            R.id.btnLinkedin -> {
                val intentInWeb = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.linkedin.com/profile/view?id=budi-setiawan-58a733111"))
                startActivity(intentInWeb)
            }
            R.id.btnWhatsapp -> {
                val intentWaWeb = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6281946358409"))
                startActivity(intentWaWeb)
            }
        }

    }
}