package com.intuit.receiver;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {

    @Id
    private int id;

    @Column
    private String symbol;

    @Column
    private int price;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Stock() {
    }

    public Stock(String symbol, int price) {
        this.symbol = symbol;
        this.price = price;
    }

}
