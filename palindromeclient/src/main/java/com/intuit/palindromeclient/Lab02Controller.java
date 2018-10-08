package com.intuit.palindromeclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class Lab02Controller {

    @Value("${palindrome.baseurl}")
    private String palindromeServiceUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/processword")
    public String processWord(@RequestParam String word, Model model) {
        String url = palindromeServiceUrl + "/" + word;
        ResponseEntity<Boolean> responseEntity = restTemplate.postForEntity(url, null, Boolean.class);
        boolean isPalindrome = responseEntity.getBody();
        if (isPalindrome) {
            model.addAttribute("message", word + " is a palindrome");
        } else {
            model.addAttribute("message", word + " is not a palindrome");
        }
        return "index";
    }
}
