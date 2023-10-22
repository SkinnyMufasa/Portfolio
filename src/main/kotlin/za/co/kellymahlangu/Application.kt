package za.co.kellymahlangu

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import za.co.kellymahlangu.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
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
