package com.dw.eurex

import groovy.util.logging.Slf4j
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.validation.Validated

import java.time.Instant

@Slf4j
@Validated
@Controller("/examples")
class EurexController {

    @Get()
    HttpResponse<?> getTime() {
        log.info("Calling get examples")
        return HttpResponse.status(HttpStatus.OK).body(Instant.now().toString())
    }
}
