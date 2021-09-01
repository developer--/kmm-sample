package com.kmm.sample.di

import com.kmm.sample.posts.data.PostRepositoryImpl
import com.kmm.sample.posts.domain.PostsRepository
import org.koin.dsl.module

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 29.08.21
 */
val repositoryModules = module {
  single { PostRepositoryImpl(httpClient = get()) as PostsRepository }
}