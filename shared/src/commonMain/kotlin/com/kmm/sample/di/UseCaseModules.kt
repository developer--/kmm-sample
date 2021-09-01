package com.kmm.sample.di

import com.kmm.sample.posts.domain.FetchPostsUseCase
import org.koin.dsl.module

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 29.08.21
 */

val useCaseModules = module {
  single { FetchPostsUseCase(postsRepository = get()) }
}