package com.github.fabriciolfj;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import lombok.RequiredArgsConstructor;

@Controller("/api/v1/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonProducer personProducer;

    @Post
    public HttpResponse create(@Body final Person person) {
        personProducer.sendPerson(person);
        return HttpResponse.status(HttpStatus.CREATED);
    }
}
