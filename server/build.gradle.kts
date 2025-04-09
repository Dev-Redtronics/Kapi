plugins {
    `kapi-core`
    `kapi-docs`
}

dependencies {
    // Ktor
    api(libs.bundles.ktor.server)

    // Testing
    testImplementation(libs.bundles.testing)
}
