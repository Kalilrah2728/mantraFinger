plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.mantrafingerprint"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }

}
repositories {
    flatDir {
        dirs("libs")
    }
    google()
    mavenCentral()
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))
}