plugins {
    `kapi-core`
    `kapi-docs`
    `kapi-publish`
}

dependencies {
    api(project(":annotations"))
    implementation(libs.ksp)
}