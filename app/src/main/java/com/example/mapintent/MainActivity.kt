package com.example.mapintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.mapintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Map.setOnClickListener(View.OnClickListener {
           // val uri = Uri.parse("http://maps.google.com/maps?q=" + 37.559133 + "," + 126.927824)
            //val uri = Uri.parse("geo:0,0?q=restaurants")
            val uri = Uri.parse("geo:0,0?q=1600 Amphitheatre Parkway, Mountain+View, California")
            //geo 바꾸기
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)


        })

        binding.Filter.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("http://maps.google.com/maps?q="+37.559133+","+126.927824)
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }

        })
    }
}