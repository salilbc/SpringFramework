package com.intuit.palindromeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PAlindromeController {

    @Autowired
    private Palindrome palindrome;

    @PostMapping("/ispalindrome/{word}")
    public boolean isPalindrome(@PathVariable String word) {
        return palindrome.isPalindrome(word);
    }
}
