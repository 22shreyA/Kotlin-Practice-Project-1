package com.example.toastmsg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uploadButton = findViewById<Button>(R.id.uploadButton)
        val downloadButton = findViewById<Button>(R.id.downloadButton)
        val lightButton = findViewById<Button>(R.id.lightButton)
        val darkButton = findViewById<Button>(R.id.darkButton)
        val webViewButton = findViewById<Button>(R.id.webViewButton)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        webViewButton.setOnClickListener {
            Toast.makeText(applicationContext,"Opening Web View...",Toast.LENGTH_SHORT)
            intent = Intent(applicationContext,webVIewActivity::class.java)
        }

        uploadButton.setOnClickListener {
            Toast.makeText(applicationContext,"Uploading...",Toast.LENGTH_SHORT).show()
        }
        downloadButton.setOnClickListener {
            Toast.makeText(applicationContext,"Downloading...",Toast.LENGTH_SHORT).show()
            // explicit intent -> to redirect from one page to another in a single application
            intent = Intent(applicationContext,DownloadedPage::class.java)
        }

        lightButton.setOnClickListener {
            layout.setBackgroundResource(R.color.cyan)
        }
        darkButton.setOnClickListener {
            layout.setBackgroundResource(R.color.dark_blue)
        }

    }
}