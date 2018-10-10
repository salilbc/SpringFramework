package com.intuit.sender;

import org.springframework.stereotype.Component;

@Component
public class Symbol {

    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
