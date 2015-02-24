package fr.logger.com;

import java.util.LinkedList;



public class Logger {

	public Level level;
	public LinkedList<Cible> cibles;
	
	private String className;

	public Logger(Class<?> maClasse) {
		this.className = maClasse.getCanonicalName();
		this.cibles = new LinkedList<Cible>();

	}


	public void addCible(Cible cible) {
		cibles.add(cible);
	}


	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	/*public void error(String message){
		try {
			if(this.cible.getClass().getCanonicalName().equalsIgnoreCase(ConsoleCible.class.getCanonicalName())) {
				this.cible.Envoyer(message, this.className);
			}
		}
		catch(Exception e) {
			this.cible = new ConsoleCible();
			this.cible.Envoyer(message, this.className);
		}
		
	
		//Formateur.setLevel(Level.ERROR);

	}*/

	static void info(String message){


	}


	static void debug(String message){




	}
}