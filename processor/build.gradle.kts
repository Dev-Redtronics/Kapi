plugins {
    `kapi-core`
    `kapi-docs`
    `kapi-publish`
}

dependencies {
    implementation(project(":annotations"))
    implementation(libs.bundles.generation)

    testImplementation(libs.bundles.testing)
}
