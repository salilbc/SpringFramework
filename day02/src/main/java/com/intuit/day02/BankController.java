package com.intuit.day02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/deposit")
    public String deposit(@RequestParam("accountNumber") int accountNumber, @RequestParam int amount, @RequestParam String type) {
        accountService.deposit(accountNumber, amount, type);
        return "Deposited";
    }

    @PostMapping("/withdraw")
    public String  withdraw(@RequestParam("accountNumber") int accountNumber, @RequestParam int amount, @RequestParam String type) {
        accountService.withdraw(accountNumber, amount, type);
        return "Withdrawn";
    }
 }

