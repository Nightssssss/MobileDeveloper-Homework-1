plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.musicplayer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.musicplayer"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // ViewPager2
    implementation ("androidx.viewpager2:viewpager2:1.0.0")
    // TabLayout from Google Material Design Components
    implementation ("com.google.android.material:material:1.12.0")
    // Lottie for Android
    implementation ("com.airbnb.android:lottie:6.4.0")

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}