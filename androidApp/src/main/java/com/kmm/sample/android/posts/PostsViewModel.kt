package com.kmm.sample.android.posts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kmm.sample.posts.domain.FetchPostsUseCase
import com.kmm.sample.posts.domain.model.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 01.09.21
 */
class PostsViewModel(private val postsUseCase: FetchPostsUseCase) : ViewModel() {

  private val _postsLiveData = MutableLiveData<List<Post>>()
  val postsLiveData: LiveData<List<Post>> get() = _postsLiveData

  init {
    viewModelScope.launch(Dispatchers.Main.immediate) {
      val posts = postsUseCase.execute()
      _postsLiveData.value = posts
    }
  }
}