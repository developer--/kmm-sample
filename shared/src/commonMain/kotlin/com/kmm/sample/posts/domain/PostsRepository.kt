package com.kmm.sample.posts.domain

import com.kmm.sample.posts.domain.model.Post

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 29.08.21
 */
interface PostsRepository {
  suspend fun fetchPosts() : List<Post>
}