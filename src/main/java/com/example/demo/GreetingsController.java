package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    
    @GetMapping("route/a/{name}")
    String one(@PathVariable String name) {
      return "Hello " + name;
    }

    @GetMapping("route/b/{name}")
    String two(@PathVariable String name) {
      return "Goodbye " + name;
    }
  }
