package com.intuit.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class MyController {

    @PostMapping("/processname")
    public String process(@RequestParam("firstname") String firstName, Model model, HttpSession session){
        String message = "Hello " + firstName;
        model.addAttribute("message", message);
        //session.setAttribute("message", message);
        return "result";
    }

    @GetMapping("/lunch")
    public String eat(){
        return "monday";
    }
}
