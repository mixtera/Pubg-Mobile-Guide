package com.f.pubgmobileguide

import android.app.Application
import com.google.android.gms.ads.MobileAds
import com.yandex.metrica.YandexMetrica
import com.yandex.metrica.YandexMetricaConfig

class PUBGApp : Application(){

    override fun onCreate() {
        super.onCreate()
        val config = YandexMetricaConfig.newConfigBuilder(API_KEY).build()
        YandexMetrica.activate(applicationContext, config)
        YandexMetrica.enableActivityAutoTracking(this)
        MobileAds.initialize(this)
    }

    companion object {
        private const val API_KEY = "8be22aed-9856-4432-84d1-8267d4c325eb"
    }

}