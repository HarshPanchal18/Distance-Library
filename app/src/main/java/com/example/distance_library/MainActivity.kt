package com.example.distance_library

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.distance_lib.LatLonDistanceCalculator
import com.example.distance_lib.Point
import com.example.distance_library.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val delhiRailwayStation = Point(28.6612218.toInt(), 77.2276811.toInt())
        val jaipurRailwayStation = Point(26.9128256.toInt(), 75.7875926.toInt())

        val distanceBetweenPoints: Float =
            LatLonDistanceCalculator.calculateDistance(delhiRailwayStation, jaipurRailwayStation)

        binding.distanceTextView.text =
            "Between Delhi Railway station and Jaipur Railway station there are: $distanceBetweenPoints KM"
    }
}
