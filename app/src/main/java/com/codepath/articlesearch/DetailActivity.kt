package com.codepath.articlesearch

import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.flixter2.Movies

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var bylineTextView: TextView
    private lateinit var abstractTextView: TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the views for the screen
        mediaImageView = findViewById(R.id.mediaImage)
        titleTextView = findViewById(R.id.mediaTitle)
        bylineTextView = findViewById(R.id.mediaByline)
        abstractTextView = findViewById(R.id.mediaAbstract)

        // TODO: Get the extra from the Intent
        val movies = intent.getSerializableExtra(ARTICLE_EXTRA) as Movies




        // TODO: Set the title, byline, and abstract information from the article
        titleTextView.text = movies.Original
        bylineTextView.text = movies.overview
        abstractTextView.text= movies.rating.toString()
        Glide.with(this)
            .load(movies.mediaImageUrl)
            .into(mediaImageView)

        // TODO: Load the media image

    }
}