package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class txtHandler {
    public static void main(String[] args) {

    }
    public static LinkedList<String> readTXT(String filename){
        LinkedList<String> data = new LinkedList<>();
        try {
            //initialize file object
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            //read in lines, creating new link for each line.
            while (myReader.hasNextLine()) {
                data.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

    public static void writeTXT(String output,String filename) throws IOException{
        createFile(filename);
        try (FileWriter namesWriter = new FileWriter(filename)) {
            namesWriter.write(output);
        }catch (IOException e) {
            System.out.println("An error occurred writing to file.");
            e.printStackTrace();
        }
    }

    private static void createFile(String filename) {
        try {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred creating file.");
            e.printStackTrace();
        }
    }
}
