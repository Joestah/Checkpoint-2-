import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.lang.*;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FormatNames {

    public static void main(String[] args) throws FileNotFoundException {
        // Replace this with statements to set the file name (input) and file name (output).
        // Initially it will be easier to hardcode suitable file names.

        // Set up a new Scanner to read the input file.
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.
    
    	File inputFile = new File("input.txt");
    	PrintWriter output = new PrintWriter("output.txt");
    	Scanner reader = new Scanner(inputFile);	
    	if(args[0] == "-u") 
    	{
    		while(reader.hasNextLine()) 
    		{
    			String currentLine = reader.nextLine();
    			String[] currentLineSplit = currentLine.split(" ");
    			currentLineSplit[0] = currentLineSplit[0].toUpperCase();
    			currentLineSplit[1] = currentLineSplit[1].toUpperCase();
   				currentLineSplit[2] = currentLineSplit[2].substring(0, 2) +"/"+currentLineSplit[2].substring(2, 4)+"/"+currentLineSplit[2].substring(4);
   				output.println(currentLineSplit[0]+" "+currentLineSplit[1]+" "+currentLineSplit[2]);
        		
   			}
           	System.out.println("You need to add your own code to do anything");
            reader.close();
            output.close();
    	}
    	else 
    	{
    	
    		while(reader.hasNextLine()) 
    		{
    			String currentLine = reader.nextLine();
    			String[] currentLineSplit = currentLine.split(" ");
    			currentLineSplit[0] = Character.toUpperCase(currentLineSplit[0].charAt(0)) + currentLineSplit[0].substring(1);
    			currentLineSplit[1] = Character.toUpperCase(currentLineSplit[1].charAt(0)) + currentLineSplit[1].substring(1);
    			currentLineSplit[2] = currentLineSplit[2].substring(0, 2) +"/"+currentLineSplit[2].substring(2, 4)+"/"+currentLineSplit[2].substring(4);
       			output.println(currentLineSplit[0]+" "+currentLineSplit[1]+" "+currentLineSplit[2]);
    		
    		}
    		System.out.println("You need to add your own code to do anything");
    		reader.close();
    		output.close();
    	}

    } // main

} // FilesInOut
