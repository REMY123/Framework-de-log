package fr.logger.com;

import java.util.LinkedList;



public class Logger {
	public Class<?> classe;
	public Level level;
	public LinkedList<Cible> cibles;
	

	public Logger(Class<?> maClasse) {
		this.classe = maClasse;
		this.cibles = new LinkedList<Cible>();
		
	}


	/*public  void setClass(Class<?> maClasse) {
		this.classe  = maClasse;

	}*/
	
	public Class<?> getClasse() {
		return classe;
	}





	public LinkedList<Cible> getCibles() {
		return cibles;
	}



	public void setCible(Cible cible) {
		cibles.add(cible);
	}
		
	
	

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	
		
	
	
		public void error(String message){
		this.setLevel(Level.ERROR);
		
			
		}
		
		public void info(String message){
			this.setLevel(Level.INFO);
			
		}

		public void debug(String message){
			this.setLevel(Level.DEBUG);
			
		}
	
		
	}

	
