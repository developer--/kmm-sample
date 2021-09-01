package com.kmm.sample

import com.kmm.sample.posts.domain.FetchPostsUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 29.08.21
 */
class CoreSdk : KoinComponent {
  val postUseCase: FetchPostsUseCase by inject()
}