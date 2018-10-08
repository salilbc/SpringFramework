package com.intuit.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//http://localhost:8080/hello
//java -jar -Dserver.port:9090 target/demo.jar

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String HelloWorld(){
        return "Hello World..Welcome to Spring Boot";
    }

    @PostMapping("/bye")
    @ResponseBody
    public String bye(){
        return "Bye bye";
    }
}
