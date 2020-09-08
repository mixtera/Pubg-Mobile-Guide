package com.f.pubgmobileguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_details.adView
import kotlinx.android.synthetic.main.activity_main.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val section = intent.getSerializableExtra("section") as MenuSection

        sectionImageView.setImageResource(section.image)
        descriptionTextView.text = section.description

        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }
}