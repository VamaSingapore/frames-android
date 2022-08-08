@file:Suppress("SpellCheckingInspection")

object Dependencies {
    //std lib
    val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    // Android
    const val kotlinCoroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
    const val kotlinCoroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val materialDesign = "com.google.android.material:material:${Versions.materialDesign}"
    const val lifeCycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycle}"
    const val lifeCycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycle}"

    // Compose
    const val compose_material3 =  "androidx.compose.material3:material3:${Versions.compose_material3}"
    const val compose_ui = "androidx.compose.ui:ui:${Versions.compose_version}"
    const val compose_ui_tooling = "androidx.compose.ui:ui-tooling:${Versions.compose_version}"
    const val compose_customview_poolingcontainer = "androidx.customview:customview-poolingcontainer:${Versions.compose_customview_poolingcontainer}"
    const val compose_ui_tooling_preview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose_version}"
    const val compose_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.compose_viewmodel}"

    // Compose Test
    const val compose_ui_test = "androidx.compose.ui:ui-test-junit4:${Versions.compose_version}"
    const val compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest:${Versions.compose_version}"

    // Networking Dependencies
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
    const val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"

    // Instrumented Test
    const val androidxJunit = "androidx.test.ext:junit:${Versions.androidxJunit}"
    const val androidxJunitKtx = "androidx.test.ext:junit-ktx:${Versions.androidxJunit}"
    const val androidxTestRunner = "androidx.test:runner:${Versions.androidJunit5}"
    const val androidxTestCore = "androidx.test:core:${Versions.androidJunit5}"
    const val androidxTestCoreKtx = "androidx.test:core-ktx:${Versions.androidJunit5}"
    const val androidxTestRules = "androidx.test:rules:${Versions.androidJunit5}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    // JUnit4
    const val junit4 = "junit:junit:${Versions.junit4}"

    // junit vintage engine
    const val junitVintageEngine =  "org.junit.vintage:junit-vintage-engine:${Versions.junitVintageEngine}"

    // JUnit5
    const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junit5Jupiter}"
    const val junitJupiterEngine =
        "org.junit.jupiter:junit-jupiter-engine:${Versions.junit5Jupiter}"
    const val junitJupiterParams =
        "org.junit.jupiter:junit-jupiter-params:${Versions.junit5Jupiter}"
    const val mannodermausAndroidJunitCore =
        "de.mannodermaus.junit5:android-test-core:${Versions.mannodermausAndroidJunit5}"
    const val mannodermausAndroidTestRunner =
        "de.mannodermaus.junit5:android-test-runner:${Versions.mannodermausAndroidJunit5}"

    // Test Helper libraries
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"
    const val kluent = "org.amshove.kluent:kluent:${Versions.kluent}"
    const val kluentAndroid = "org.amshove.kluent:kluent-android:${Versions.kluent}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    const val okhttpMockServer = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"
    const val kotlinCoroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"
    const val jsonTest = "org.json:json:${Versions.jsonTest}"

    // Logging
    const val eventLogger = "com.checkout:checkout-sdk-event-logger-android:${Versions.eventLogger}"
}
