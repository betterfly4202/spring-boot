package com.betterfly.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by betterFLY on 2018. 1. 27.
 * Github : http://github.com/betterfly88
 */

@RestController
public class WebRestController {

    @GetMapping(value = "/hello")
    public String hello(){

        return "hello my world";
    }
}
