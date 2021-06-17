/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */

package ex43;
import ex42.txtHandler;

import java.io.IOException;

public class indexHTML {

    public static String formatHTML(String websitename, String author) {
        String output = " <!DOCTYPE html> \n<html> \n<head> \n"
                +"<meta author=\"" + author + "\"> \n"
                + "<title>" + websitename + "</title>\n"
                + "</head> \n</html>";
        return output;
    }

    public static void createHTML(String websitename, String author) throws IOException {
        String output = formatHTML(websitename, author);
        String filename = "./website/" + websitename + "/index.html";
        txtHandler.writeTXT(output,filename);
    }
}
