plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.17.3"
}

group = "com.nordrecharged"
version = "1.0.0"

repositories {
    mavenCentral()
}

sourceSets {
    main {
        resources {
            srcDirs("resources")
        }
    }
}

intellij {
    version.set("2023.3")
    type.set("IC")
    plugins.set(listOf())
}

tasks {
    patchPluginXml {
        sinceBuild.set("233")
        untilBuild.set("243.*")
    }

    buildSearchableOptions {
        enabled = false
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
