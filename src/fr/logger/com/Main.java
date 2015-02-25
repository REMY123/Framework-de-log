package fr.logger.com;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		
		
		//Createur.getlog(Main.class);
		
		Logger log = Createur.getlog(Main.class);
		
		Level lev = Level.DEBUG;
		String cible1="a.txt";
	
		
		
		Config.level(Main.class, lev);
		System.out.println(log.level);
		log.error("ok");
		System.out.println(log.level);
		Config.addCible(Main.class,cible1 );
		Config.addCible(Main.class,cible1);
		Config.addCible(Main.class,cible1 );
		Config.addCible(Main.class,cible1 );
		Config.addCible(Main.class,"okok" );
		
		log.error("ok");
		
		System.out.println(log.classe);
		
		HashSet<String> hs = Logger.cibles;
		Iterator<String> iter = hs.iterator();
		while (iter.hasNext()) {
			  						String element = iter.next();
		  }
		
		
	  
		
		
		
	
		
		
	}

}
