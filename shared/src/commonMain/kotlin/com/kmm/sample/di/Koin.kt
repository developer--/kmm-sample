package com.kmm.sample.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 29.08.21
 */
fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
  appDeclaration()
  modules(
    getNetworkModule(),
    useCaseModules,
    repositoryModules,
  )
}
