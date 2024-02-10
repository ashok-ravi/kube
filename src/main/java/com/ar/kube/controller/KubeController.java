package com.ar.kube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class KubeController {

    @GetMapping("hello-kube")
    public Map<String, String> sayHello(){
        return Map.of("Hello", "World");
    }

}
