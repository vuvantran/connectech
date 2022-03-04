package org.ymca;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private double price;
    private int remainingAmount;

    public Product(int id, String name, double price, int remainingAmount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.remainingAmount = remainingAmount;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setRemainingAmount(int remainingAmount){
        this.remainingAmount = remainingAmount;
    }

    public int getRemainingAmount(){
        return this.remainingAmount;
    }
}
