plugins {
    `kapi-core`
    com.google.devtools.ksp
}

dependencies {
    implementation(project(":annotations"))
    ksp(project(":processor"))
}
