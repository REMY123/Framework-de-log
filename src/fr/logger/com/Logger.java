package fr.logger.com;

import java.util.HashSet;
import java.util.Iterator;

import com.sun.tools.javac.util.Log;

public class Logger {
	// Attributs
	public Class<?> classe;
	public Level level = Level.DEBUG;
	String[] messageLevel = { "ceci est un message de error par defaut",
			"ceci est un message d'info par defaut",
			"ceci est un message debug par defaut" };
	public HashSet<String> cibles = new HashSet<String>();
	public HashSet<String> ciblesR = new HashSet<String>();
	Formateur F;

	public Formateur getF() {
		return F;
	}

	public void setF(Formateur f) {
		F = F;
	}

	public Logger(Class<?> maClasse) {
		this.classe = maClasse;
		F = new FormateurDefault();

	}

	public Class<?> getClasse() {
		return classe;
	}

	// Accessseurs
	public String getMessageError() {
		return this.messageLevel[0];
	}

	public void setMessageError(String messageError) {
		this.messageLevel[0] = messageError;
	}

	public String getMessageInfo() {
		return this.messageLevel[1];
	}

	public void setMessageInfo(String messageInfo) {
		this.messageLevel[1] = messageInfo;
	}

	public String getMessageDebug() {
		return this.messageLevel[2];
	}

	public void setMessageDebug(String messageDebug) {
		this.messageLevel[2] = messageDebug;
	}

	public void setCible(String cible) {

		this.cibles.add(cible);
	}

	public Level getLevel() {
		return level;
	}
	
	public void setCibleR(String cible) {

		this.ciblesR.add(cible);
	}

	public Level getLevelR() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	// //////////////////////////

	public void error(String message) {
		this.messageLevel[0] = message;

	}

	public void info(String message) {

		this.messageLevel[1] = message;
	}

	public void debug(String message) {

		this.messageLevel[2] = message;
	}

	// lance l'ecriture dans les cible
	public void show() {
		int i;
		Level lev;

		HashSet<String> hs = this.cibles;
		Iterator<String> iter = hs.iterator();
		while (iter.hasNext()) {
			String element = iter.next();

			//ecrit dans la console
			if (element.equals("Console")) {
				for (i = level.getLevel(); i >= 0; i--) {
					lev = level.getLevel(i);
					ConsoleCible.cible(F.Formateur(this, this.messageLevel[i],
							lev));
				}
			}

			//ecrit dans les fichier 
			else {
				for (i = level.getLevel(); i >= 0; i--) {
					lev = level.getLevel(i);
					FileCible.cible(
							F.Formateur(this, this.messageLevel[i], lev),
							element);
				}
			}

		}
		
		
		
		
		HashSet<String> R = this.ciblesR;
		Iterator<String> iter1 = R.iterator();
		while (iter1.hasNext()) {
			String element = iter1.next();
			for (i = level.getLevel(); i >= 0; i--) {
				lev = level.getLevel(i);
				FichierRotatif.rotatif(
						F.Formateur(this, this.messageLevel[i], lev),
						element);
			}
			
			
		}
		
		

	}

}
