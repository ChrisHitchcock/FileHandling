/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filewritingreadingexceptionhandling;
import java.io.*;
import java.util.*;
/**
 *
 * @author chhit5249
 */
public class FileWritingReadingExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File newFile = new File("test.txt");
        FileWriter out;
        BufferedWriter writeFile;
        String text2;
        Scanner kb = new Scanner(System.in);
        try 
        {
            out = new FileWriter(newFile);
            writeFile = new BufferedWriter(out);
            System.out.println("What is your favourite colour?");
            text2 = kb.next();
            writeFile.write("Favourite colour is: ");
            writeFile.write(text2);
            writeFile.close();
            out.close();
            System.out.println("Data written to file.");
        } 
        catch (IOException e)
        {
            System.out.println("Problem writing to file");
            System.err.println("IOException: "+e.getMessage());
        }
        
        //test
        
        /* This was testing reading files
        FileReader in;
        BufferedReader readFile;
        String text;
        try 
        {
            in = new FileReader(newFile);
            readFile = new BufferedReader(in);
            while ((text=readFile.readLine())!=null)
            {
                System.out.println(text);
            }
            readFile.close();
            in.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File does not exist or cannot be found.");
            System.err.println("FileNotFoundException: "+e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("File cannot be read.");
            System.err.println("IOException: "+e.getMessage());
        }
        */
        
        /* This was to test file creation
        if (newFile.exists())
        {
            System.out.println("File already exists.");
        } else {
            System.out.println("File created.");
        }
        try 
        {
            newFile.createNewFile();
            System.out.println("New file created.");
        }
        catch (IOException e) {
            System.out.println("File can't be created.");
            System.err.println("IOException: "+e.getMessage());
        }
        */
    }
    
}
