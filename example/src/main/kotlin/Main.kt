package dev.redtronics.kapi

import dev.redtronics.kapi.server.KapiServer
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*

public fun main() {
    embeddedServer(CIO) {
        install(KapiServer) {

        }
    }
}