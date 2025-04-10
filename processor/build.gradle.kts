plugins {
    `kapi-core`
    `kapi-docs`
    `kapi-publish`
}

dependencies {
    implementation(project(":annotations"))
    implementation(libs.ksp)
    implementation(libs.reflect)
}
