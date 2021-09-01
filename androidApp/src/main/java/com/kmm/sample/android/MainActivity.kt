package com.kmm.sample.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kmm.sample.android.posts.PostsViewModel
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val viewModel: PostsViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.postsLiveData.observe(this,{

        })
    }
}
