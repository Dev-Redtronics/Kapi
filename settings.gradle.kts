plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}
rootProject.name = "Kapi"

include(":example")
include(":processor")
include(":annotations")
