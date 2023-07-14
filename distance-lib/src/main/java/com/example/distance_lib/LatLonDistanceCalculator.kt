package com.example.distance_lib

import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

class LatLonDistanceCalculator {
    companion object {
        private val EARTH_RADIUS_IN_KILOMETERS = 6371
        fun calculateDistance(
            pointA: Point,
            pointB: Point
        ): Float {
            val dLat = Math.toRadians((pointB.latitude - pointA.latitude).toDouble())
            val dLng = Math.toRadians((pointB.longitude - pointA.longitude).toDouble())
            val a = sin(dLat / 2) * sin(dLat / 2)+
                    cos(Math.toRadians(pointA.latitude.toDouble())) *
                    cos(Math.toRadians(pointB.latitude.toDouble())) *
                    sin(dLng / 2) * sin(dLng / 2)
            val c = 2 * atan2(sqrt(a), sqrt(1 - a))
            return (EARTH_RADIUS_IN_KILOMETERS * c).toFloat()
        }
    }
}
