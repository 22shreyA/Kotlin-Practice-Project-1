package com.example.toastmsg

import android.content.Intent
import android.media.CamcorderProfile
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class DownloadedPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_downloaded_page)

        val cameraView = findViewById<CardView>(R.id.cameraView)
        val webView = findViewById<CardView>(R.id.webView)

        webView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("www.google.com")
            startActivity(intent)
        }

        cameraView.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}

