package fr.logger.com;

import java.util.*;
import java.text.*;

public class Main {
	
	public static void main(String args[]){
		
		Date maintenant = new Date();
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);

		Class cls = String.class;
		Package pkg = cls.getPackage();
		String name = pkg.getName(); 
	
		for(Logger logger : Logger.values()){
			switch(logger){

				case DEBUG:
					System.out.println("Le : " + mediumDateFormat.format(maintenant) + "  [NAME=" + name + " LEVEL=" + Logger.DEBUG + "  MESSAGE=   " + "]");
					break;
				
				case INFO:
					System.out.println("Le : " + mediumDateFormat.format(maintenant) + "  [NAME=" + name + " LEVEL=" + Logger.INFO + "  MESSAGE=   " + "]");
					break;
					
				case ERROR:
					System.out.println("Le : " + mediumDateFormat.format(maintenant) + "  [NAME=" + name + " LEVEL=" + Logger.ERROR + "  MESSAGE=   " + "]");
					break;
			}
		}
	}
}

