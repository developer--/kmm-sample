package com.kmm.sample.posts.data

import com.kmm.sample.posts.data.model.PostDto
import com.kmm.sample.posts.domain.PostsRepository
import com.kmm.sample.posts.domain.model.Post
import io.ktor.client.*
import io.ktor.client.request.*

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 29.08.21
 */
class PostRepositoryImpl(private val httpClient: HttpClient) : PostsRepository {
  override suspend fun fetchPosts(): List<Post> {
    val response = httpClient.get<List<PostDto>>("https://jsonplaceholder.typicode.com/photos")
    return response.toDomainModel()
  }

  private fun List<PostDto>.toDomainModel(): List<Post> {
    return map {
      Post(
        albumId = it.albumId,
        id = it.id,
        title = it.title,
        url = it.url
      )
    }
  }
}