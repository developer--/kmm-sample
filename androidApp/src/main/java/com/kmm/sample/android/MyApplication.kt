package com.kmm.sample.android

import android.app.Application
import com.kmm.sample.android.di.viewModels
import com.kmm.sample.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 01.09.21
 */
class MyApplication : Application() {
  override fun onCreate() {
    super.onCreate()
    initKoin {
      androidLogger(Level.ERROR)
      androidContext(this@MyApplication)
      modules(
        listOf(viewModels)
      )
    }
  }
}