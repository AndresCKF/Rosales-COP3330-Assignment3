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
        //reads .txt file and replaces utilize with use
        String string = getReplacedText();
        String newFileName = getFileName();
        //outputs modified file with given name
        fileHandler.writeNewFile(string, newFileName);
    }

    public static String getReplacedText() throws IOException {
        String string = fileHandler.readFile("src/resources/exercise45_input.txt");
        string = string.replaceAll("utilize", "use");
        return string;
    }

    private static String getFileName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter new file name");
        String newFileName = scanner.nextLine();
        return newFileName;
    }
}
