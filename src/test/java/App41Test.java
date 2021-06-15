/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import solution41.txtHandler;

import java.util.*;

public class App41Test {

    @Test
    void checktxtHandler_readfile_works(){
        LinkedList<String> fixed = new LinkedList<>(Arrays.asList("Head, Bucket","Armadillo, Mozart"));
        LinkedList<String> test = txtHandler.readTXT("src/test/java/exercise41_input.txt");
        Assert.assertEquals(fixed, test);
    }
}
