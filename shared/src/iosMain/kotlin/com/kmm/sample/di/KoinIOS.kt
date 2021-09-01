package com.kmm.sample.di

import org.koin.core.KoinApplication
import org.koin.dsl.module

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 29.08.21
 */
fun initKoinIos(
  doOnStartup: () -> Unit
): KoinApplication = initKoin(appDeclaration = {
  module {
    single { doOnStartup }
  }
})