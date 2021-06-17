/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
//alphabetize the list of names taken in
//write my own code to parse csv.
package ex42;
import java.io.IOException;
import java.util.*;
public class App42 {
    public static void main(String[] args) throws IOException {
        //Read txt file line by line into an array
        //parse each arrayelement with splitStringToPerson
        //create an array of persons
        //send array of persons to output formatter
        //send back to print
        LinkedList<String> txtLines = txtHandler.readTXT("src/main/java/ex42/exercise42_input.txt");
        //Convert lines into array of arrays
        String[][] employeesTable = linesToEmployees(txtLines);
        String output = formatDisplay(employeesTable);
        txtHandler.writeTXT(output,"src/main/java/ex42/exercise42_output.txt" );
    }

    private static String formatDisplay(String[][] employeesTable) {
        String output = "Last     First    Salary\n---------------------------";
        for (String[] strings : employeesTable) {
            output = output + "\n";
            for (int j = 0; j < 3; j++) {
                output = output + strings[j];
                int len = strings[j].length();
                //format number of spaces after entry.
                for (int k = 0; k < 9 - len; k++) {
                    output = output + " ";
                }
            }
        }
    return output;
    }
    // turns each line from txt into a table of employee info.
    private static String[][] linesToEmployees(LinkedList<String> txtLines) {
        String[][] arrays = new String[txtLines.size()][];
        for(int i = 0; i < txtLines.size(); i++){
            arrays[i] = splitStringToPerson(txtLines.get(i));
        }
        return arrays;
    }

    public static String[] splitStringToPerson(String string){
        String[] person = new String[3];
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            Character ch = string.charAt(i);
            if (ch.compareTo(',') == 0) { //if current char is , send out stringbuilder and reset.
                person[j] = sb.toString();
                j = j + 1;
                sb.setLength(0);
            }else if(i == string.length() - 1){ //stop at salary.
                sb.append(ch);
                person[j] = sb.toString();
            }
            else{
                sb.append(ch);

            }
        }
        return person;
    }

}
