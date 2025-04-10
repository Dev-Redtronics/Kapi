plugins {
    `kapi-core`
    `kapi-docs`
    `kapi-publish`
}

dependencies {
    // Ktor
    api(libs.bundles.ktor.server)

    // Testing
    testImplementation(libs.bundles.testing)
}
