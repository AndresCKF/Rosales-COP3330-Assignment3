/*
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */

package ex43;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App43 {
    public static void main(String[] args) throws IOException {
//        Prompt for the name of the site.
        String websitename = getWebsitename();
        makeDir(websitename,"");
//        Prompt for the author of the site.
        String author = getAuthor();
//        Ask if the user wants a folder for JavaScript files.
        javascriptSubfolder(websitename);
//        Ask if the user wants a folder for CSS files.
        cssSubfolder(websitename);
//        Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
        indexHTML.createHTML(websitename, author);
    }

    private static String getAuthor() {
        System.out.println("What is the Author's name?");
        return userInput();
    }

    private static String getWebsitename() {
        System.out.println("What is the websites name?");
        return userInput();
    }

    private static void cssSubfolder(String name) {
        System.out.println("Do you want to create a CSS folder?");
        String answer = userInput();
        if (answer.equals("y") || answer.equals("Y")){
            makeDir(name, "/css");
        }
    }

    private static void javascriptSubfolder(String name) {
        System.out.println("Do you want to create a JavaScript folder?");
        String answer = userInput();
        if (answer.equals("y") || answer.equals("Y")){
            makeDir(name,"/js");
        }
    }

    private static void makeDir(String name, String subfolder) {
        String directory = "./website/" + name + subfolder;
        new File(directory).mkdirs();

    }


    private static String userInput() {
        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();
        if(output.equals("")){
            System.out.println("String cannot be empty!");
            userInput();
        }
        return output;
    }
}
