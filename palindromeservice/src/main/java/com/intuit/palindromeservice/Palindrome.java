package com.intuit.palindromeservice;

import org.springframework.stereotype.Component;

@Component
public class Palindrome {

    public boolean isPalindrome(String word) {
        String[] wordArr = word.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = wordArr.length - 1; i > -1; i--) {
            sb.append(wordArr[i]);
        }
        String reversedWord = sb.toString();
        return word.equalsIgnoreCase(reversedWord);
    }
}
