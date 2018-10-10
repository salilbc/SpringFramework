package com.intuit.receiver;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends CrudRepository<Stock, Integer> {

    List<Stock> findAllBySymbol(String symbol);
}
