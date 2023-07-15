# Distance-Library

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

## Description
* The Distance-Library is a lightweight and efficient library that provides functions to calculate the distance between two geographical points using their latitude and longitude coordinates. 
* It utilizes the [Haversine formula](https://www.movable-type.co.uk/scripts/latlong.html) to accurately compute distances on the Earth's surface.

## Installation

You can include the library in your project using one of the following methods:

### Gradle

Add the following dependency to your project's `build.gradle` file:
```groovy
implementation 'com.github.HarshPanchal18:Distance-Library:2.0.0'
```
_OR_

### Kotlin

Add the following dependency to your project's `build.gradle.kts` file:
```kotlin
implementation("com.github.HarshPanchal18:Distance-Library:2.0.0")
```

### Usage

```kotlin
val delhiRailwayStation = Point(28.6612218.toInt(), 77.2276811.toInt())
val jaipurRailwayStation = Point(26.9128256.toInt(), 75.7875926.toInt())

val distanceBetweenPoints: Float = LatLonDistanceCalculator.calculateDistance(delhiRailwayStation, jaipurRailwayStation)

binding.distanceTextView.text = "Between Delhi Railway station and Jaipur Railway station there are: $distanceBetweenPoints KM"
```

### Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request. For major changes, it is recommended to first open a discussion to discuss the proposed changes.

### License
This library is distributed under the MIT License. See the LICENSE file for more information.

### Contact
For any questions or inquiries, please contact at [@HarshPanchal18](https://github.com/HarshPanchal18)

* Feel free to customize and expand this template to provide more details about your library and its functionalities.
