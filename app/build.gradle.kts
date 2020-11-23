import Dependencies.androidTestEspresso
import Dependencies.androidTestExt
import Dependencies.app_compat
import Dependencies.constraint_layout
import Dependencies.core_ktx
import Dependencies.junitTest
import Dependencies.kotlin_stdlib
import Dependencies.material
import Versions.build_tools_version
import Versions.compile_sdk_version
import Versions.min_sdk_version
import Versions.target_sdk_version

plugins {
    id(Plugins.androidApp)
    kotlin(Plugins.kotlinAndroid)
    kotlin(Plugins.kotlinExt)//enable synthetic
    kotlin(Plugins.kotlinApt)//enable kapt: kotlin anotation process tool
}

android {
    compileSdkVersion(compile_sdk_version)
    buildToolsVersion(build_tools_version)

    defaultConfig {
        applicationId="com.kotlin.gradlekotlindsl"
        minSdkVersion(min_sdk_version)
        targetSdkVersion(target_sdk_version)
        versionCode=100
        versionName="1.0.0"
        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {

        }
        getByName("release") {
            isMinifyEnabled = true
        }
    }
    compileOptions {
        sourceCompatibility=JavaVersion.VERSION_1_8
        targetCompatibility=JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    sourceSets["main"].java.srcDir("src/main/kotlin")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin_stdlib)
    implementation(core_ktx)
    implementation(app_compat)
    implementation(material)
    implementation(constraint_layout)
    testImplementation (junitTest)
    androidTestImplementation(androidTestExt)
    androidTestImplementation(androidTestEspresso)
}