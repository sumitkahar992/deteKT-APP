plugins {
    id("os.android.feature")
    id("os.android.library.compose")
}

android {
    namespace = "com.github.despicable.feature.home"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)

    implementation(libs.androidx.compose.material.icons.extended)

    implementation(libs.androidx.constraintlayout.compose)
}
