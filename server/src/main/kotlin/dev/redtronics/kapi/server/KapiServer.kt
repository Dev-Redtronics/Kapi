package dev.redtronics.kapi.server

import io.ktor.server.application.*
import io.ktor.util.*

public data class Config(val test: String)

public class KapiServer {
    public companion object Plugin : BaseApplicationPlugin<ApplicationCallPipeline, Config, KapiServer> {
        override val key: AttributeKey<KapiServer> = AttributeKey("KapiServer")

        override fun install(pipeline: ApplicationCallPipeline, configure: Config.() -> Unit): KapiServer {
            TODO("Not yet implemented")
        }
    }
}