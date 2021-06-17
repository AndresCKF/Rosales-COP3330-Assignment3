/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
import ex42.txtHandler;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import ex42.App42;

import java.util.Arrays;
import java.util.LinkedList;

public class solution42Test {

    @Test
    void checktxtHandler_readfile_works(){
        LinkedList<String> fixed = new LinkedList<>(Arrays.asList("Head, Bucket","Armadillo, Mozart"));
        LinkedList<String> test = txtHandler.readTXT("src/test/java/testNames.txt");
        Assert.assertEquals(fixed, test);
    }

    @Test
    void splitStringToPerson_givesCorrectObject(){
        String[] testResult = App42.splitStringToPerson("Ling,Mai,55900");
        String[] expected = new String[]{"Ling", "Mai", "55900"};
        Assert.assertEquals(testResult, expected);
    }

}
