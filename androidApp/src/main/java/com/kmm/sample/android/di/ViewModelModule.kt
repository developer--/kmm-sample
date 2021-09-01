package com.kmm.sample.android.di

import com.kmm.sample.android.posts.PostsViewModel
import org.koin.dsl.module

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 01.09.21
 */

val viewModels = module {
  single { PostsViewModel(postsUseCase = get()) }
}