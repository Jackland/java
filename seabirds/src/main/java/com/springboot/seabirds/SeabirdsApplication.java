package com.springboot.seabirds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SeabirdsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeabirdsApplication.class, args);
    }

    @GetMapping("getList")
    public String list(){
        return "hello，world!";
    }

    @GetMapping("getAge")
    public Integer getAge(){
        return 111;
    }

}
