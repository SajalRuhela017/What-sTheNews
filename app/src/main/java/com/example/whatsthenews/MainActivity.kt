package com.example.whatsthenews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsthenews.databinding.ActivityMainBinding

//API Key : a629c54bbc614f9a8735ec1bd7efbe85

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}