package org.workshops.helloloulou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloLoulouApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloLoulouApplication.class, args);
    }

    @GetMapping("/emmm")
    public String hello() {
        return "Het cheffa!";
    }


}
