package com.example.demo.slf4j

import com.example.demo.slf4j.Slf4j.Companion.log
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Slf4j
class Slf4jController {
    @GetMapping("/test1")
    fun test():String {
        log.warn("test1")
        return "test1"
    }
}