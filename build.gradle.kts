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
    mainClass.set("com.github.dvasilev86.java_ta_experimental.MainKt")
}

tasks.register<JavaExec>("runTest") {
    group = "application"
    description = "Run test main()"
    classpath = sourceSets["test"].runtimeClasspath
    mainClass.set("com.github.dvasilev86.java_ta_experimental.TestKt")
}