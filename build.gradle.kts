plugins {
    `kapi-docs`
}

repositories {
    mavenCentral()
}

dependencies {
    dokka(project(":annotations"))
    dokka(project(":processor"))
}

dokka {
    dokkaPublications.html {
        outputDirectory = project.projectDir.resolve("docs/html")
    }
}
