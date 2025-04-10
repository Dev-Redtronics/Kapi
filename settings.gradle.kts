plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}
rootProject.name = "Kapi"

include(":server")
include(":client")
include(":example")
include(":common")
