/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import solution41.App41;
import solution41.txtHandler;

import java.lang.reflect.Array;
import java.util.*;

public class App41Test {

    @Test
    void checktxtHandler_readfile_works(){
        LinkedList<String> fixed = new LinkedList<>(Arrays.asList("Head, Bucket","Armadillo, Mozart"));
        LinkedList<String> test = txtHandler.readTXT("src/test/java/testNames.txt");
        Assert.assertEquals(fixed, test);
    }
    @Test
    void alphabetize_test(){
        LinkedList<String> input = new LinkedList<>(Arrays.asList("Johnson, Jim",
                "Zarnecki, Sabrina", "Jones, Chris"));
        LinkedList<String> expected = new LinkedList<>(Arrays.asList("Johnson, Jim",
                "Jones, Chris", "Zarnecki, Sabrina"));
        LinkedList<String> result = App41.alphabetize(input);
        Assert.assertEquals(expected, result);
    }
}
