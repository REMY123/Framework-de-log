package fr.logger.com;

import java.text.DateFormat;
import java.util.Date;


public class Formateur extends Logger{
	
	public static void message(String message,String level){
		
		 Date maintenant = new Date();
		 DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		System.out.println(mediumDateFormat.format(maintenant)+" [NAME=FR.ESIEA.TP LEVEL="+level+"  MESSAGE= "+message+"]");
	

		
	}

}

