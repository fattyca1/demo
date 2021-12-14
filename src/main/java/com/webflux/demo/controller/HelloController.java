package com.webflux.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * <br>哈哈控制器</br>
 *
 * @author fattyca1
 * @since 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Mono<String> getHello(){
        return Mono.just("hello");
    }

}
