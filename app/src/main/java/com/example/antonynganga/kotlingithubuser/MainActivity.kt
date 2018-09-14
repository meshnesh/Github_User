package com.example.antonynganga.kotlingithubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.antonynganga.kotlingithubuser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.repositoryName.text = "Modern Kotlin Medium Article"
        binding.repositoryOwner.text = "MeshNesh"
        binding.numberOfStarts.text = "2 Stars"
    }

    var repository = Repository("Modern Kotlin Medium Article",
            "MeshNesh", 2, true)
}
