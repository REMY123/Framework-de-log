package fr.logger.com;

import java.util.Map;

public class Main {
	
	public static void main (String[] args){
		
		Logger logger = new Logger(Main.class);
		//logger.setCible(new ConsoleCible());
	    
		/*
		Logger.ajoutCible("A");
	    Logger.ajoutCible("B");
	    Logger.ajoutCible("C");
	    Logger.ajoutCible("D");
	    Logger.deleteCible("D");
	    Logger.afficheCible();*/
		
		logger.error("Test premier ");
		logger.error("Test premier ");
		logger.error("Test premier ");
		logger.error("Test premier ");
		
	    
	   }
}
