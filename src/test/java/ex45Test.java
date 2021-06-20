/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */

import ex45.App45;
import ex45.fileHandler;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ex45Test {

    @Test
    public void test_fileReader() throws IOException {
        String ls = System.getProperty("line.separator");
        String expected = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead."+ls +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She" +ls +
                "utilizes an IDE to write her Java programs\".";
        String result = fileHandler.readFile("src/resources/exercise45_input.txt");
        assertEquals(expected, result);
    }
    @Test
    public void test_textReplacer() throws IOException {
        String ls = System.getProperty("line.separator");
        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead."+ls +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She" +ls +
                "uses an IDE to write her Java programs\".";
        String result = App45.getReplacedText();
        assertEquals(expected, result);
    }
}
