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
        //while item not found, returns true
        boolean condition;

        //read from JSON and outputs an object containing list of products
        Products database = getdataJSON();
        do {
            //ask for name of product to search
            System.out.print("Please enter a product to search\n");
            String product2Search = scanner.nextLine();
            //Search for product2Search in database
            Product searchResult = productSearch(database, product2Search);
            //if item found returns false, ending do-while
            condition = printResult(searchResult);

        }while(condition);
    }

    private static boolean printResult(Product searchResult) {
        //empty string returns no result
        if(searchResult.name.equals("")){
            System.out.println("Sorry no results\n");
            return true;
        } else{
            //format print statement
            String name = searchResult.name;
            Double price = searchResult.price;
            int quantity = searchResult.quantity;
            System.out.printf("Name: %s \nPrice: %f \nQuantity: %d",name,price,quantity);
            //let program know item was found, ending program.
            return false;
        }

    }

    private static Product productSearch(Products database, String product2Search) {
        //empty string will return back an empty product, letting know nothing found.
        if( product2Search.equals("")){
            Product searchResult = new Product();
            return searchResult;
        }else {
            ArrayList<Product> searchList = database.getList();
            for(int i = 0; i< searchList.size(); i++){
                //iterates through items of database and checks if name is equal to product2SearchString
                boolean condition = searchList.get(i).name.equals(product2Search);
                //once an item from database is equal to search string, returns the current item
                if(condition){
                    return searchList.get(i);
                }
            }
            //if for loop finishes without a positive result, we know product was not found and return empty.
            Product searchResult = new Product();
            return searchResult;
        }
    }

    public static Products getdataJSON() {
        try {
            // create Gson instance
            Gson gson = new Gson();
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("src/resources/exercise44_input.json"));
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
