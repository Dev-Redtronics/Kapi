plugins {
    `kapi-docs`
}

repositories {
    mavenCentral()
}

dependencies {
    dokka(project(":client"))
    dokka(project(":server"))
    dokka(project(":common"))
}

dokka {
    dokkaPublications.html {
        outputDirectory = project.projectDir.resolve("docs/html")
    }
}
