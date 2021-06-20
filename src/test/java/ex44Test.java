/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */

import ex44.App44;
import ex44.Product;
import ex44.Products;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ex44Test {
    @Test
    void readingFromJSONfile() throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Product> listing = new ArrayList<Product>();
        listing.add(new Product("Widget", 25.00, 5));
        listing.add(new Product("Thing", 15.00, 5));
        listing.add(new Product("Doodad", 5.00, 10));
        //expected is manually created Object containing arraylist
        Products expected = new Products(listing);
        //run the app that reads from JSON
        Products result = App44.getdataJSON();
        ArrayList<Product> listExp = expected.getList();
        ArrayList<Product> listresult = result.getList();
        assert listExp.get(0).equals(listresult.get(0));
        assert listExp.get(1).equals(listresult.get(1));
        assert listExp.get(2).equals(listresult.get(2));
    }
}
