package com.beer.finereport.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author beer
 * @date 2019/1/6 15:37
 */
@RestController
public class HelloWebService {


    @GetMapping("/hello")
    public String hello() {
        return "hello beer!";
    }
}
