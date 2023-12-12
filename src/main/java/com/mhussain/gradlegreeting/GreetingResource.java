package com.mhussain.gradlegreeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.time.Instant.now;

@RequestMapping("/resources/greetings")
@RestController
public class GreetingResource {

    @GetMapping
    Greeting greeting() {
        return new Greeting("Hello Sina Hussain @ " + now());
    }

}