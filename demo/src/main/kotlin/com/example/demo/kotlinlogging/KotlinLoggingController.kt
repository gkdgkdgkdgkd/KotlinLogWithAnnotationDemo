package com.example.demo.kotlinlogging

import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinLoggingController {
    private val logging = KotlinLogging.logger{}
    @GetMapping("/test2")
    fun test():String {
        logging.warn { "test2" }
        return "test2"
    }
}