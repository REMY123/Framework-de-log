package fr.logger.com;



public class Logger {

	public Level level;
	public Cible cible;
	private String className;

	public Logger(Class<?> maClasse) {
		this.className = maClasse.getCanonicalName();

	}


	public void setCible(Cible cible) {
		this.cible = cible;
	}


	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public void error(String message){
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

	}

	static void info(String message){


	}


	static void debug(String message){




	}
}