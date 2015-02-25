package fr.logger.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Formater extends Logger {
	
	public Formater() throws IOException {
		
		System.out.println("How many output(s) do you want to add ?");

		int j;
	    int i = new Scanner(System.in).nextInt();
	    
	    System.out.println("adding " + i + " output(s)...");
	    System.out.println("Type name(s). Press Enter after each name");
	    
		String[] outputs = new String[i];
	    
	    for(j=0; j<i; j++)
	    {
	    	InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader keyboard = new BufferedReader(in);
			String format = keyboard.readLine();
	    	outputs[j] = (String) format;
	    }
	    	
	    System.out.println(outputs[1]);
	    
	    for(j=0; j<i; j++)
	    {
	    	switch(outputs[j])
	    	{
	    		case "date":
	    			Date date = new Date();
	    			SimpleDateFormat dt1 = new SimpleDateFormat("EEEEE  dd-MMMM-yyyy  HH-mm-ss");
	    		    System.out.println(dt1.format(date));
	    		    break;
	    		
	    		case "level":
	    			Level level = new Level();
	    			level.getLevel(); //pourquoi ya pas de getteur dans Level ..? On en a besoin nan?
	    		    System.out.println("LEVEL : " + level);
	    		    break;
	    		 
	    		case "message":
	    			//get les messages de quelques part
	    			//du style -->
	    			Message message = new Message();
	    			message.getMessage();
	    			System.out.println("MESSAGE : " + message);
	    			
	    	}
	    }
	    
	    
	}
}
