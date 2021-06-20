/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package ex41;
import java.io.IOException;
import java.util.*;
public class App41 {
    public static void main(String[] args) throws IOException {
        //read in text file
        //parse text file by newline, creating a new string for each line, this being person
        //alphabetize the strings and count them
        LinkedList<String> namesList = txtHandler.readTXT("./src/resources/exercise41_input.txt");
        namesList = alphabetize(namesList);
        String output = stringBuilder(namesList); //turns list of names into a string to be sent to .txt file
        txtHandler.writeTXT(output);
    }
//turn linkedlist into a single string of the alphabetized names
    private static String stringBuilder(LinkedList<String> namesList) {
        StringBuilder sb = new StringBuilder();

        //first line
        Iterator<String> iterator = namesList.iterator();
        String output = String.format("Total of %d names.\n-----------------\n", namesList.size());
        while (iterator.hasNext()) {
            // appending using "+" operator
            output = output + iterator.next() + "\n";
        }        //use \n to append new line to StringBuilder/StringBuffer
        return output;
    }

    public static LinkedList<String> alphabetize(LinkedList<String> namesList) {
        //bubble sort
        for(int j = 0; j < namesList.size() - 1; j++) {
            for (int i = 0; i < namesList.size() - j - 1; i++) {
                int var = namesList.get(i).compareTo(namesList.get(i + 1));
                if (var > 0) {
                    String swapHelper = namesList.get(i);
                    namesList.set(i, namesList.get(i + 1));
                    namesList.set(i + 1, swapHelper);
                }
            }
        }
        return namesList;
    }
}
