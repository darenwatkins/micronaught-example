package com.dw.eurex;

import java.time.Instant;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;


@Validated
@Controller("/examples")
public class EurexController {

    @Get()
    public HttpResponse<?> getTime() {
        return HttpResponse.status(HttpStatus.OK).body(Instant.now().toString());
    }
}
