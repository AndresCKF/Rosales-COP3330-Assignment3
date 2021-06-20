/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */

import ex46.App46;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ex46Test {

    @Test
    void check_txt2Map() throws FileNotFoundException {
        Map<String, Integer> readMap = App46.txt2Map();
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("badger",7);
        expectedMap.put("mushroom",2);
        expectedMap.put("snake",1);
        assertTrue(expectedMap.equals(readMap));
    }

}
