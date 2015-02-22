package fr.logger.com;

public class Main {
	
	public static void main (String[] args){
	    
		Logger.ajoutCible("A");
	    Logger.ajoutCible("B");
	    Logger.ajoutCible("C");
	    Logger.ajoutCible("D");
	    Logger.deleteCible("D");
	    Logger.afficheCible();
	    
	   }
}
