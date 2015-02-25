package fr.logger.com;

import java.util.HashSet;
import java.util.Iterator;

public class Createur {

	public static HashSet<Logger> hs = new HashSet<Logger>();
	
	public static Logger getlog(Class<?> classe) {
		// TODO Auto-generated method stub
		//appeller le setclass de logger, lui attribuer la classe, ajouter le log a la liste.
		
		//parcourir la liste retourner s'il existe, le cree s'il n'existe pas !!!!
		
		Iterator<Logger> iter = hs.iterator();
		while (iter.hasNext()) {
		  Logger element = iter.next();
		  if ( element.getClasse().equals(classe)) {
			 
		    return element;
		  }}
		
		Logger log = new Logger(classe);
		hs.add(log);
		//System.out.println(log.classe);
		
		return log;
	}

	}
