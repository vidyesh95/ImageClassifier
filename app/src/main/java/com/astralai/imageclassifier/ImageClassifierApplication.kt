package com.astralai.imageclassifier

import android.app.Application
import timber.log.Timber

class ImageClassifierApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}