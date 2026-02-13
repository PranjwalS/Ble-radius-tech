plugins {
}

    android {
    namespace = "com.example.bleradiustechapp"
    compileSdk = 36

    defaultConfig {
      applicationId = "com.example.bleradiustechapp"
    minSdk = 24
    targetSdk = 36
    versionCode = 1
    versionName = "1.0"

      testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
       release {
           isMinifyEnabled = false
           proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
       }
    }
    }

  dependencies {

  }