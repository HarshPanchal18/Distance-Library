package com.example.distance_library

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.distance_lib.LatLonDistanceCalculator
import com.example.distance_lib.Point
import com.example.distance_library.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buenosAiresObeliscoPoint =
            Point((-34.6037389).toInt(), (-58.3815704).toInt())

        val nycStatueOfLibertyPoint =
            Point(40.6892494.toInt(), (-74.0445004).toInt())

        val distanceBetweenPoints =
            LatLonDistanceCalculator.calculateDistance(
                buenosAiresObeliscoPoint,
                nycStatueOfLibertyPoint
            )

        binding.distanceTextView.text =
            "Between the Obelisco and the Statue of Liberty there are: $distanceBetweenPoints KM"
    }
}
