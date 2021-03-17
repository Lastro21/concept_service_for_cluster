package ru.sbrf.centralproducer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${my_any_app.my_any_id}")
    String instance;

    @GetMapping("/any")
    public String hi() throws InterruptedException {

//        Thread.sleep(2000);
//        Thread.sleep(1000);
//        Thread.sleep(900);

        return "Welcome, i am " + instance;

    }
}
