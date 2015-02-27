package fr.logger.com;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {

		Logger log = Createur.getlog(Main.class); // creer un log
		Config.properties("test.properties",log);
		Config.addCible(log.classe, "fichier.txt");
		Config.addCibleR(log.classe, "fichierRotatif.txt");
		log.show();
		
	}

}
