package fr.logger.com;

import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Iterator;

public  class Cible {
	//public abstract void Envoyer(String message, String className);
	HashSet<String> hs = Logger.cibles;

	String message;
	
	public void messsage(Logger log, String mess) {
		while( iter.hasNext()){
			
		if(log.cibles.equals ("CONSOLE")){
			System.out.println(message);
		}
		
		
	else{
		String place = "fihchier_de_log.txt";
    	File fihchier = new File(place);
    	
    	

    	
    	try{
 
    		FileWriter writer = new FileWriter(fihchier, true);
    		try{
           		
           		writer.write(message);

           	}
    		finally{
    			writer.close();

    		}
    	}
    	catch (Exception e){
            System.out.println("Impossible de creer le fichier");

    	}
    }
 }
	
	}	
}
	
/*	public void cible(String mess) {
		this.message = mess;
	}
	*/
	

	// ne pas cree une cible un message.

	
	/*
	public void Envoyer(String message) {
		System.out.println(message);
	}
*/






	






	
		

}
