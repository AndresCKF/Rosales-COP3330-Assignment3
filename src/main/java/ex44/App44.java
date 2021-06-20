/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */
//
package ex44;

import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition;
        //read from JSON and outputs an object containing list of products
        Products database = getdataJSON();
        do {
            System.out.print("Please enter a product to search\n");
            String product2Search = scanner.nextLine();
            //Search for product2Search in database
            Product searchResult = productSearch(database, product2Search);
            condition = printResult(searchResult);

        }while(condition);
    }

    private static boolean printResult(Product searchResult) {
        if(searchResult.name.equals("")){
            System.out.println("Sorry no results\n");
            return true;
        } else{
            String name = searchResult.name;
            Double price = searchResult.price;
            int quantity = searchResult.quantity;
            System.out.printf("Name: %s \nPrice: %f \nQuantity: %d",name,price,quantity);
            return false;
        }

    }

    private static Product productSearch(Products database, String product2Search) {
        if( product2Search.equals("")){
            Product searchResult = new Product();
            return searchResult;
        }else {
            ArrayList<Product> searchList = database.getList();
            for(int i = 0; i< searchList.size(); i++){
                boolean condition = searchList.get(i).name.equals(product2Search);
                if(condition){
                    return searchList.get(i);
                }
            }
            Product searchResult = new Product();
            return searchResult;
        }
    }

    public static Products getdataJSON() {
        try {
            // create Gson instance
            Gson gson = new Gson();
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("src/main/java/ex44/exercise44_input.json"));
            // convert JSON array to list of users
            Products obj = new Gson().fromJson(reader, Products.class);
            // close reader
            reader.close();
            return obj;
        } catch (Exception ex) {
            ex.printStackTrace();
            Products fail = new Products();
            return fail;
        }

    }

}
