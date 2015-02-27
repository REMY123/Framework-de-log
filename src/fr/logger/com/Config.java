package fr.logger.com;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;

public class Config {

	// changer le level
	public static void level(Class<?> classe, Level level) {
		Createur.getlog(classe).setLevel(level);
	}

	// supp cibles
	public static void suppCible(Class<?> classe, String cible) {
		Createur.getlog(classe).suppcibles(cible);
	}

	// supp cibles rotatives
	public static void suppCibleR(Class<?> classe, String cible) {
		Createur.getlog(classe).suppciblesR(cible);
	}

	// ajouter des cibles
	public static void addCible(Class<?> classe, String cible) {
		Createur.getlog(classe).setCible(cible);
	}

	// ajouter des cibles rotatives
	public static void addCibleR(Class<?> classe, String cible) {

		Createur.getlog(classe).setCibleR(cible);
	}

	// définit un formateur
	public static void formateur(Class<?> classe, Formateur formateur) {
		Createur.getlog(classe).setF(formateur);
	}

	// Configuration du log avec le fichier properties
	public static void properties(String fileName, Logger log)
			throws ClassNotFoundException {
		int i;
		String l;

		Properties prop = new Properties();
		try {
			FileInputStream in = new FileInputStream(fileName);
			prop.load(in);

			
			
			// recupere le level et le mets dans log
			l = prop.getProperty("Level");
			if (l != null) {
				if (l.equals("ERROR"))
					log.setLevel(Level.ERROR);

				if (l.equals("INFO"))
					log.setLevel(Level.INFO);

				if (l.equals("DEBUG"))
					log.setLevel(Level.DEBUG);
			}

			
			
			// recup les cibles et les mets dans log
			i = 1;
			while (prop.getProperty("Cible" + i) != null) {
				log.setCible(prop.getProperty("Cible" + i));
				i++;
			}

			
			
			// recup les cibles rotatives et les mets dans log
			i = 1;
			while (prop.getProperty("RotatifCible" + i) != null) {
				log.setCibleR(prop.getProperty("RotatifCible" + i));
				i++;
			}

			
			
			// recup les messages et les mets dans log
			log.setMessageDebug(prop.getProperty("MessageDebug"));
			log.setMessageInfo(prop.getProperty("MessageInfo"));
			log.setMessageError(prop.getProperty("MessageError"));

			in.close();
		} catch (IOException e) {
			System.err.println("Unable to load config file.");
		}

	}
}
