package com.intuit.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockReceiverController {

    @Autowired
    private StockRepository stockRepository;

    @GetMapping("/getprice/{symbol}")
    public List<Stock> getPrice(@PathVariable String symbol) {
        List<Stock> list = stockRepository.findAllBySymbol(symbol);
        return list;
    }
}
