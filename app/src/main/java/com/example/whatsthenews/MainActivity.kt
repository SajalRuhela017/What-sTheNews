package com.example.whatsthenews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsthenews.databinding.ActivityMainBinding

//API Key : a629c54bbc614f9a8735ec1bd7efbe85

class MainActivity : AppCompatActivity(), NewsItemClicked {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val items = fetchData()
        val adapter = NewsListAdapter(items , this)
        binding.recyclerView.adapter = adapter
    }


    private fun fetchData(): ArrayList<String> {
        val list = ArrayList<String>()
        for(i in 0 until 100) {
            list.add("Item $i")
        }
        return list
    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this, "$item is clicked" , Toast.LENGTH_SHORT).show()
    }
}