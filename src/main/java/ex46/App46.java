/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */

package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App46 {
    public static void main(String[] args) throws FileNotFoundException {
        //read in textfile and creates a Map with word paired with frequency of word in document
        Map<String, Integer> words = txt2Map();
        //send Map to be sorted, highest to lowest frequency
        Map<String, Integer> sortedWords = sortByFreq(words);
        displayMap(sortedWords);

    }

    private static void displayMap(Map<String, Integer> sortedWords) {
        for (Map.Entry<String, Integer> entry : sortedWords.entrySet()) {
            //displays current word
            System.out.print("\n" + entry.getKey() + ":");
            //keeps spaces between word and histogram consistent
            for(int i = 0; i< (10 - entry.getKey().length());i++){
                System.out.print(" ");
            }
            //outputs * for every instance of word found
            for(int i = 0; i< entry.getValue();i++){
                System.out.print("*");
            }
        }
    }

    private static Map<String, Integer> sortByFreq(Map<String, Integer> words) {
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        //takes original words map and outputs to a new map that is reverse sorted (highest to lowest)
        words.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        return reverseSortedMap;
    }

    public static Map<String, Integer> txt2Map() throws FileNotFoundException {
        Map<String, Integer> words = new HashMap<String, Integer>();
        //open file
        Scanner sc = new Scanner(new File("./src/resources/exercise46_input.txt"));
        //while there is a non space character keep going
        while(sc.hasNext()){
            //reads up to next space
            String s = sc.next();
            //if word is in map, add 1 to its int
            if(words.containsKey(s)){
                int count = words.get(s);
                words.put(s, count + 1);
                //else create a new key value pair initializing at 1.
            }else {
                words.put(s, 1);
            }
        }
        return words;
    }
}
