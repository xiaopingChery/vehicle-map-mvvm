// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    // Apply the Android application plugin to the project
    id("com.android.application") version "8.0.0"
    id("org.jetbrains.kotlin.android") version "1.6.0"
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}