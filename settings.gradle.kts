plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}
rootProject.name = "Kapi"

include(":server")
include(":client")
include(":example")
include(":common")
include("ksp-annotations")
include("ksp-processors")
