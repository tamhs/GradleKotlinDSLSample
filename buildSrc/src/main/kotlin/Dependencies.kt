/**
 * Copyright © 2020.
 * Created by tam.hs on 11/23/2020.
 */

object Versions {
    const val kotlin_lib_version = "1.4.10"
    const val android_gradle_plugin = "4.0.0"

    const val compile_sdk_version = 30
    const val build_tools_version = "30.0.2"
    const val min_sdk_version = 21
    const val target_sdk_version = 30

    const val appcompat = "1.2.0"
    const val core_ktx = "1.3.2"
    const val constraint_layout = "2.0.4"
    const val material = "1.2.1"

    const val junitTest = "4.13.1"
    const val androidTestExt = "1.1.2"
    const val androidTestEspresso = "3.3.0"
}

object Dependencies {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_lib_version}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val app_compat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    const val junitTest = "junit:junit:${Versions.junitTest}"
    const val androidTestExt = "androidx.test.ext:junit:${Versions.androidTestExt}"
    const val androidTestEspresso = "androidx.test.espresso:espresso-core:${Versions.androidTestEspresso}"
}

object ClassPaths {
    const val android_gradle_plugin =
        "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_lib_version}"
}

object Plugins {
    const val androidApp = "com.android.application"
    const val kotlinAndroid = "android"
    const val kotlin = "kotlin"
    const val kotlinExt = "android.extensions"
    const val kotlinApt = "kapt"
}