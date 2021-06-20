/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */

package ex44;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(){
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product))
            return false;
        Product other = (Product)o;
        boolean currencyCodeEquals = (this.name == null && other.name == null)
                || (this.name != null && this.name.equals(other.name));
        return this.price == other.price && currencyCodeEquals && this.quantity == other.quantity;
    }
}