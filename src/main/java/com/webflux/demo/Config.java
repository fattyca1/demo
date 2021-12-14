package com.webflux.demo;

import org.springframework.web.reactive.function.client.WebClient;

/**
 * <br>配置类</br>
 *
 * @author fattyca1
 * @since 1.0
 */
public class Config {
    
    public WebClient webClient(){
        WebClient webClient = WebClient.builder().clientConnector().build();
        return webClient;
    }
}
