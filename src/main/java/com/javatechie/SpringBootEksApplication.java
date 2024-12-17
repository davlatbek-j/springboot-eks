package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootEksApplication
{


    @GetMapping("/")
    public String message()
    {
        return "Happy NEW YEAR !!! App Successfully deployed";
    }

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootEksApplication.class, args);
    }

}
