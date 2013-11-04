/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readerwriterlab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class TextReaderStrategy throws IOException{
        File data = new File("src" + File.separatorChar + "test.txt");

        BufferedReader in = null;
        
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
}
