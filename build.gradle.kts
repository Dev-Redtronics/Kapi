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
