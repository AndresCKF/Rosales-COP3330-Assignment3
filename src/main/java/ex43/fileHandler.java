/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */

package ex43;

import java.io.File;

import static ex43.App43.userInput;

public class fileHandler {
    public static void makeDir(String name, String subfolder) {
        String directory = "./website/" + name + subfolder;
        new File(directory).mkdirs();
    }
    static void javascriptSubfolder(String name) {
        System.out.println("Do you want to create a JavaScript folder?");
        String answer = userInput();
        if (answer.equals("y") || answer.equals("Y")){
            makeDir(name,"/js");
        }
    }
    static void cssSubfolder(String name) {
        System.out.println("Do you want to create a CSS folder?");
        String answer = userInput();
        if (answer.equals("y") || answer.equals("Y")){
            makeDir(name, "/css");
        }
    }
}
