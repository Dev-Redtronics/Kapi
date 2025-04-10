plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

kotlin {
    explicitApi()
    compilerOptions {
        allWarningsAsErrors = true
    }
}
dependencies {
    implementation(libs.bundles.build.src)
    testImplementation(libs.bundles.testing)
}
