import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FormatNamesm {

    public static void main(String[] args) throws FileNotFoundException {
    	File inputFile = new File(args[1]);
    	PrintWriter output = new PrintWriter(args[2]);
    	Scanner reader = new Scanner(inputFile);	
    	if(args[0] == "-u") 
    	{
    		while(reader.hasNextLine()) 
    		{
    			String currentLine = reader.nextLine();
    			String[] currentLineSplit = currentLine.split(" ");
    			if(currentLineSplit.length == 4) 
    			{
    				currentLineSplit[0] = currentLineSplit[0].toUpperCase();
        			currentLineSplit[1] = currentLineSplit[1].toUpperCase()+".";
        			currentLineSplit[2] = currentLineSplit[2].toUpperCase();
        			currentLineSplit[3] = currentLineSplit[3].substring(0, 2) +"/"+currentLineSplit[3].substring(2, 4)+"/"+currentLineSplit[3].substring(4);
        			output.println(currentLineSplit[0]+" "+currentLineSplit[1]+" "+currentLineSplit[2]+" "+currentLineSplit[3]);
    			}
    			else 
    			{
    				currentLineSplit[0] = currentLineSplit[0].toUpperCase();
        			currentLineSplit[1] = currentLineSplit[1].toUpperCase();
       				currentLineSplit[2] = currentLineSplit[2].substring(0, 2) +"/"+currentLineSplit[2].substring(2, 4)+"/"+currentLineSplit[2].substring(4);
       				output.println(currentLineSplit[0]+" "+currentLineSplit[1]+" "+currentLineSplit[2]);
    			}
    			
        		
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
    			if(currentLineSplit.length == 4) 
    			{
    				currentLineSplit[0] = Character.toUpperCase(currentLineSplit[0].charAt(0)) + currentLineSplit[0].substring(1);
    				currentLineSplit[1] = currentLineSplit[1].toUpperCase() + ".";
    				currentLineSplit[2] = Character.toUpperCase(currentLineSplit[2].charAt(0)) + currentLineSplit[2].substring(1);
    				currentLineSplit[3] = currentLineSplit[3].substring(0, 2) +"/"+currentLineSplit[3].substring(2, 4)+"/"+currentLineSplit[3].substring(4);
    				output.println(currentLineSplit[0]+" "+currentLineSplit[1]+" "+currentLineSplit[2]+" "+currentLineSplit[3]);
    			}
    			else 
    			{
    			currentLineSplit[0] = Character.toUpperCase(currentLineSplit[0].charAt(0)) + currentLineSplit[0].substring(1);
    			currentLineSplit[1] = Character.toUpperCase(currentLineSplit[1].charAt(0)) + currentLineSplit[1].substring(1);
    			currentLineSplit[2] = currentLineSplit[2].substring(0, 2) +"/"+currentLineSplit[2].substring(2, 4)+"/"+currentLineSplit[2].substring(4);
       			output.println(currentLineSplit[0]+" "+currentLineSplit[1]+" "+currentLineSplit[2]);
    			}
    		
    		}
    		System.out.println("You need to add your own code to do anything");
    		reader.close();
    		output.close();
    	}

    } // main

} // FilesInOut