package fr.logger.com;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {

		Logger log = Createur.getlog(Main.class); // creer un log
		Logger log2 = Createur.getlog(Createur.class); // creer un log
		// Formateur lll= new Formateur();
		// Config.formateur(log.classe,lll);
		Config.level(log.classe, Level.INFO);
		//Config.level(log2.classe, Level.ERROR);

		// log.init();
		 // parametres du log depuis le
													// fichier properties
         //System.out.println(log2.cibles);
		
		//Config.addCible(Createur.class, "Consolzze");
		Config.addCible(log2.classe, "Console");
		
		
		//System.out.println("cibles de log:"+log.cibles);
		
		//System.out.println("level de log2:"+log2.level);
		//System.out.println("level de log:"+log.level);
		
		// log.init();// initialisation du log avec valeur par defaut

		Config.properties("a.properties",log2); // parametres du log depuis
		Config.addCibleR(log2.classe, "a");
		Config.addCibleR(log2.classe, "b");
		
		// le fichier properties
		System.out.println("cibles rotatives de log2:"+log2.ciblesR);
		// System.out.println(log.messageDebug);
		// System.out.println(log.messageError);
		// System.out.println(log.messageInfo);
		// System.out.println(F.getMessage());

		// log.show();// pour lancer l'ecriture sur les cibles.
		log2.show();
		//log.show();

	}

}
