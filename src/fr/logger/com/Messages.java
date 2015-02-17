package fr.logger.com;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;

public class Messages {
    public static void main(final String[] args) {
    	String place = "fichier_de_log.txt";
    	File fichier = new File(place); 
    	
    	Date maintenant = new Date();
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);

    	
    	try {
           // Création du fichier
           //fichier.createNewFile();
           // Création du writer
    		FileWriter writer = new FileWriter(fichier, true);
           	try {
           		writer.write("Journal des logs : " + mediumDateFormat.format(maintenant));
           		writer.write("\n\n");
           		writer.write("/////////////////////////////////////////////////////////////");
           		writer.write("\n\n");

           	} finally {
           		// On ferme le fichier
           		writer.close();
           	}
    	} catch (Exception e) {
    		System.out.println("Impossible de creer le fichier");
    	}
    }
}