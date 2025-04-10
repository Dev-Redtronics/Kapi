plugins {
    `kapi-core`
    `kapi-docs`
    `kapi-publish`
}

dependencies {
    // Ktor
    api(libs.bundles.ktor.client)

    // Testing
    testImplementation(libs.bundles.testing)
}
