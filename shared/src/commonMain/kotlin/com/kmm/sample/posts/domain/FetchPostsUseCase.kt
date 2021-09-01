package com.kmm.sample.posts.domain

import com.kmm.sample.common.ensureNeverFrozen
import com.kmm.sample.posts.domain.model.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 29.08.21
 */
class FetchPostsUseCase(private val postsRepository: PostsRepository) {

  init {
    ensureNeverFrozen()
  }

  suspend fun execute(): List<Post> {
    return fetchPosts(postsRepository)
  }

  private suspend fun fetchPosts(postsRepository: PostsRepository) =
    withContext(Dispatchers.Default) {
      postsRepository.fetchPosts()
    }
}