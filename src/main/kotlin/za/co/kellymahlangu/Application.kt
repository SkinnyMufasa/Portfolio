package za.co.kellymahlangu

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import za.co.kellymahlangu.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        routing {
            get("/admin") {
                call.respondText("Admin Page!")
            }

            get("/") {
                call.respondText("Main Page")
            }
        }
    }.start(wait = true)
}

fun Application.module() {
    configureMonitoring()
    configureSockets()
    configureSecurity()
    configureTemplating()
    configureSerialization()
    configureDatabases()
    configureRouting()
}
