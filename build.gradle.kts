plugins {
    kotlin("jvm") version "2.1.10"
}

group = "ru.ivan_shilin.compiler.lab1"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(22)
}