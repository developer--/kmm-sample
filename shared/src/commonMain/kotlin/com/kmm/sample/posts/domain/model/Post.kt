package com.kmm.sample.posts.domain.model

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 29.08.21
 */
data class Post(
  val albumId: Long,
  val id: Long,
  val title: String,
  val url: String
)