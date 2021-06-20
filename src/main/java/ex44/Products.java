/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */

package ex44;

import java.util.ArrayList;

public class Products {
    public ArrayList<Product> products;

    public Products(){
        this.products = new ArrayList<>();
    }

    public Products(ArrayList<Product> products) {
        this.products = products;
    }
    public ArrayList<Product> getList(){
        return this.products;
    }
}