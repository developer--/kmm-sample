buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        val sqlDelight = "1.5.0"
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
        classpath("com.android.tools.build:gradle:7.0.1")
        classpath ("org.jetbrains.kotlin:kotlin-serialization:1.5.21")
        classpath ("com.squareup.sqldelight:gradle-plugin:$sqlDelight")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

//apply(plugin = "koin")

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}