import dev.redtronics.buildSrc.Project
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    org.jetbrains.kotlin.jvm
    org.jetbrains.kotlin.plugin.serialization
}

group = "${Project.GROUP}.${Project.NAME.lowercase()}.${project.name.lowercase()}"
version = 

repositories {
    mavenCentral()
}

public val targetJavaVersion: JavaVersion = JavaVersion.VERSION_17
java {
    targetCompatibility = targetJavaVersion
    sourceCompatibility = targetJavaVersion

    toolchain {
        languageVersion.set(JavaLanguageVersion.of(targetJavaVersion.majorVersion))
    }
    withJavadocJar()
    withSourcesJar()
}

kotlin {
    explicitApi()
    compilerOptions {
        allWarningsAsErrors = true
    }
    jvmToolchain(targetJavaVersion.majorVersion.toInt())
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    withType<Test> {
        useJUnitPlatform()
        reports.junitXml.required = true
        systemProperty("gradle.build.dir", layout.buildDirectory.get().asFile.absolutePath)

        filter {
            isFailOnNoMatchingTests = false
        }

        testLogging {
            showExceptions = true
            showStandardStreams = true
            events = setOf(TestLogEvent.FAILED, TestLogEvent.PASSED, TestLogEvent.SKIPPED)
            exceptionFormat = TestExceptionFormat.FULL
        }
    }
}
