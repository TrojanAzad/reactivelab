package org.trojanslab.reactivedemo.client;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

public class SampleClient {

    private final WebClient client = WebClient.create("http://localhost:8080/api/");

    public String getResult(){
        return client.get().uri("hello").accept(MediaType.TEXT_PLAIN).exchange().flatMap(r -> r.bodyToMono(String.class)).block();
    }

    public Flux<String> getOlaResult(){
        return client.get().uri("ola").accept(MediaType.TEXT_PLAIN).exchange().map(r -> r.bodyToFlux(String.class)).block();
    }

}
