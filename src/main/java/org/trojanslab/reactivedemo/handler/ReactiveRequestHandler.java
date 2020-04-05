package org.trojanslab.reactivedemo.handler;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Set;

@RestController
@RequestMapping("/api")
public class ReactiveRequestHandler {

    @GetMapping("/hello")
    public Mono<ServerResponse> hello(ServerRequest serverRequest){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromValue("Hello Reactive Spring!"));
    }

    @GetMapping("/ola")
    public Flux<String> ola(){
        return Flux.fromIterable(Set.of("Hello","Adele"));
    }



}
