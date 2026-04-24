// Top-level build file where you can add configuration options common to all sub-projects/modules in the project.

plugins {
    // Make sure to include the Android Gradle plugin and version
    id("com.android.application") version "8.0.0" apply(false)
    id("org.jetbrains.kotlin.android") version "1.9.10" apply(false)
}

// You can specify the repositories to be used:
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}