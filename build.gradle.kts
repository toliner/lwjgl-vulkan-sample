import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.61"
}

group = "toliner"
version = "1.0.0"

val lwjglVersion = "3.2.0"
val lwjglNatives = "natives-windows"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile("org.lwjgl", "lwjgl", lwjglVersion)
    compile("org.lwjgl", "lwjgl-assimp", lwjglVersion)
    compile("org.lwjgl", "lwjgl-glfw", lwjglVersion)
    compile("org.lwjgl", "lwjgl-openal", lwjglVersion)
    compile("org.lwjgl", "lwjgl-stb", lwjglVersion)
    compile("org.lwjgl", "lwjgl-vma", lwjglVersion)
    compile("org.lwjgl", "lwjgl-vulkan", lwjglVersion)
    compile("org.lwjgl", "lwjgl", lwjglVersion, classifier = lwjglNatives)
    compile("org.lwjgl", "lwjgl-assimp", lwjglVersion, classifier = lwjglNatives)
    compile("org.lwjgl", "lwjgl-glfw", lwjglVersion, classifier = lwjglNatives)
    compile("org.lwjgl", "lwjgl-openal", lwjglVersion, classifier = lwjglNatives)
    compile("org.lwjgl", "lwjgl-stb", lwjglVersion, classifier = lwjglNatives)
    compile("org.lwjgl", "lwjgl-vma", lwjglVersion, classifier = lwjglNatives)
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
