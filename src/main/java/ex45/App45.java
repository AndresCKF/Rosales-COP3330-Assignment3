/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */

package ex45;

import java.io.IOException;
import java.util.Scanner;

public class App45 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String string = fileHandler.readFile("src/resources/exercise45_input.txt");
        string = string.replaceAll("utilize", "use");
        System.out.println("Please enter new file name");
        String newFileName = scanner.nextLine();
        fileHandler.createNewFile(string, newFileName);
    }
}
