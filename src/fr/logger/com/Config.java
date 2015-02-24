package fr.logger.com;

public class Config {
	
	public static void level(Class<?> classe , String level){
		Createur.getlog(classe).Logger.setLevel(level);
	}
	
	
   public static void addCible(Class<?> classe , String cible){
	   Createur.getlog(classe).Logger.setCible(cible);
	}

}
