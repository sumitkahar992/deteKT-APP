
plugins {
    id("os.android.application")
    id("os.android.application.compose")
    id("os.android.hilt")
}

android {

    namespace = "com.example.detekt_app"

    defaultConfig {
        applicationId = "com.example.detekt_app"
        versionCode = 100
        versionName = "0.0.1"
    }

}

dependencies {



    implementation(projects.feature.home)

    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.hilt.navigation.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)

    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.lifecycle.runtimeCompose)

    implementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.compose.ui.tooling.preview)

    implementation(libs.androidx.hilt.navigation.compose)
    implementation(libs.androidx.navigation.compose)

    implementation(libs.androidx.core.splashscreen)
    implementation(libs.accompanist.systemuicontroller)

    implementation(libs.coil.kt)

}
