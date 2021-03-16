package com.example.demo.slf4jandkotlinlogging

import com.example.demo.slf4jandkotlinlogging.Slf4jKotlinLogging.Companion.log
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Slf4jKotlinLogging
class Slf4jKotlinLoggingController {
    @GetMapping("/test3")
    fun test():String{
        log.warn("test3")
        return "test3"
    }
}