package com.example.demo.slf4jandkotlinlogging

import mu.KotlinLogging
import org.slf4j.Logger

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Slf4jKotlinLogging{
    companion object{
        val <reified T> T.log: Logger
        inline get() = KotlinLogging.logger{T::class.java.name}
    }
}