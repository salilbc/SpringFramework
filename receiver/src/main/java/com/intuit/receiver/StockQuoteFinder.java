package com.intuit.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class StockQuoteFinder {

    @Autowired
    private StockRepository stockRepository;

    @JmsListener(destination="StockQueue",containerFactory="stockFactory")
    public void receiveMessage(String symbol) {
        int price = (int)(Math.random() * 1000);
        System.out.println("Price of " + symbol + ": " + price);
        Stock stock = new Stock(symbol, price);
        stockRepository.save(stock);
    }
}
