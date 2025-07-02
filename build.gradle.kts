plugins {
    kotlin("jvm") version "2.0.0" // or compatible version
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("com.example.MainKt") // Replace with your actual main class
}