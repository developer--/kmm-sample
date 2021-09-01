package com.kmm.sample.posts.data.model

import kotlinx.serialization.Serializable

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 29.08.21
 */
@Serializable
data class PostDto(
  val albumId: Long,
  val id: Long,
  val title: String,
  val url: String
)