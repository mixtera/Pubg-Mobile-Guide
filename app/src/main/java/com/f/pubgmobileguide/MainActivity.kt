package com.f.pubgmobileguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.adView
import kotlinx.android.synthetic.main.activity_splash.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionList = ArrayList<MenuSection>()
        //region sectionList
        sectionList.add(
            MenuSection(
                title = getString(R.string.download_title),
                description = getString(R.string.download_description),
                image = R.drawable.download_image
            )
        )
        sectionList.add(
            MenuSection(
                title = getString(R.string.setup_title),
                description = getString(R.string.setup_description),
                image = -1
            )
        )
        sectionList.add(
            MenuSection(
                title = getString(R.string.welcome_title),
                description = getString(R.string.welcome_description),
                image = R.drawable.setup_image

            )
        )
        sectionList.add(
            MenuSection(
                title = getString(R.string.modes_title),
                description = getString(R.string.modes_description),
                image = R.drawable.welcome_image
            )
        )
        sectionList.add(
            MenuSection(
                title = getString(R.string.tips_title),
                description = getString(R.string.tips_description),
                image = R.drawable.tips_image

            )
        )
        sectionList.add(
            MenuSection(
                title = getString(R.string.squadtips_title),
                description = getString(R.string.squadtips_description),
                image = R.drawable.modes_image

            )
        )
        sectionList.add(
            MenuSection(
                title = getString(R.string.payload_title),
                description = getString(R.string.payload_description),
                image = R.drawable.squadtips_image


            )
        )
        sectionList.add(
            MenuSection(
                title = getString(R.string.winingtips_title),
                description = getString(R.string.winingtips_description),
                image =R.drawable.payload_image

            )
        )
        //endregion sectionList

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val adapter = MenuAdapter(sectionList)
        recyclerView.adapter = adapter

        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }
}

