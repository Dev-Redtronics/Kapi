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

tasks {
    test {
        useJUnitPlatform()
    }
}

dependencies {
    implementation(libs.bundles.build.src)

    testImplementation(gradleTestKit())
    testImplementation(libs.bundles.testing)
}
