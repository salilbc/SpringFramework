package com.intuit.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class StockController {

    @Autowired
    private Symbol symbol;

    @Autowired
    public JmsTemplate jmsTemplate;

    @PostMapping("/stock/{symbol}")
    public String stock_symbol(@PathVariable ("symbol") String symbol){
        jmsTemplate.convertAndSend("StockQueue ", symbol);
        return "You'll receive the stock value soon";
    }
}

