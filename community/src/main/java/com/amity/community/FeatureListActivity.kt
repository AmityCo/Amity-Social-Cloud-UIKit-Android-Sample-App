package com.amity.community

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amity.community.homepage.MyCustomCommunityHomePageActivity
import com.amity.community.newsfeed.CreatePostActivity
import com.amity.community.newsfeed.NewsFeedHomeActivity
import kotlinx.android.synthetic.main.activity_feature_list.*

class FeatureListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_list)

        btnOpenCustomCommunity.setOnClickListener {
            val intent = Intent(this, MyCustomCommunityHomePageActivity::class.java)
            startActivity(intent)
        }

        btnCommunityHome.setOnClickListener {
            val intent = Intent(this, NewsFeedHomeActivity::class.java)
            startActivity(intent)
        }

        btnCreatePost.setOnClickListener {
            val intent = Intent(this, CreatePostActivity::class.java)
            startActivity(intent)
        }

    }
}