package com.example.ppapb_musicplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ppapb_musicplayer.databinding.ActivityMainBinding
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var playing: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            playButton.setOnClickListener {
                if (!playing) {
                    playing = true
                    playButton.setImageResource(R.drawable.round_play_arrow_24)
                } else {
                    playing = false
                    playButton.setImageResource(R.drawable.round_pause_24)
                }
            }
            backButton.setOnClickListener {
                exitProcess(1)
            }
        }
    }
}