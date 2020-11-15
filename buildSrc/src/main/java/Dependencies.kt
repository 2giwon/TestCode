object Version {
    const val KOTLIN_VER = "1.4.0"
    const val ROOM_VER = "2.2.5"
}

object ProjectConfig {
    const val GRADLE = "com.android.tools.build:gradle:4.0.2"
    const val KOTLIN_GRADLE_PLUGIN =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN_VER}"
    const val ANDROID_JUNIT5 = "de.mannodermaus.gradle.plugins:android-junit5:1.6.2.0"
}

object AndroidConfig {
    const val COMPILE_SDK = 30
    const val APP_ID = "com.egiwon.randomusers"
    const val MIN_SDK = 23
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
}

object Dependencies {
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Version.KOTLIN_VER}"
    const val CORE_KTX = "androidx.core:core-ktx:1.3.0"
    const val MATERIAL = "com.google.android.material:material:1.1.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.1"

    const val ROOM_RUNTIME = "androidx.room:room-runtime:${Version.ROOM_VER}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Version.ROOM_VER}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Version.ROOM_VER}"
}

object TestDependencies {
    private const val JUNIT_VERSION = "5.7.0"

    const val JUNIT_JUPITER_API = "org.junit.jupiter:junit-jupiter-api:$JUNIT_VERSION"
    const val JUNIT_JUPITER_ENGINE = "org.junit.jupiter:junit-jupiter-engine:$JUNIT_VERSION"
    const val ASSERTJ_CORE = "org.assertj:assertj-core:3.18.0"

    const val MOCKK = "io.mockk:mockk:1.10.2"
    const val ROOM_TEST = "androidx.room:room-testing:${Version.ROOM_VER}"
}

object NetworkDependencies {
    private const val RETROFIT_VER = "2.7.2"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:$RETROFIT_VER"
    const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:$RETROFIT_VER"
    const val RXJAVA_ADAPTER = "com.squareup.retrofit2:adapter-rxjava2:$RETROFIT_VER"

    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:3.14.2"
}
