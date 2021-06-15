/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package solution41;
import java.io.IOException;
import java.util.*;
public class App41 {
    public static void main(String[] args) throws IOException {
        //read in text file
        //parse text file by newline, creating a new string for each line, this being person
        //alphabetize the strings and count them
        //output the list one by one to new .txt file with header
        LinkedList<String> namesList = txtHandler.readTXT("src/main/java/solution41/exercise41_input.txt");
        namesList = alphabetize(namesList);
        //turns list of names into a string to be sent to .txt file
        String output = stringBuilder(namesList);
        txtHandler.writeTXT(output);
    }

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

    private static LinkedList<String> alphabetize(LinkedList<String> namesList) {
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
