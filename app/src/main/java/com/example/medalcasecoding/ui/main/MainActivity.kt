package com.example.medalcasecoding.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.medalcasecoding.databinding.ActivityMainBinding
import com.example.medalcasecoding.ui.main.adapter.DataModelAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        observeLiveData()

    }


    private fun observeLiveData() {
        viewModel.infoDataLivaData.observe(this) {
            Log.d("tag00", it.toString())
            binding.recyclerViewTitle.adapter = DataModelAdapter(it)
        }
    }


}