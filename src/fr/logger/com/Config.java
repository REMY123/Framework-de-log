package fr.logger.com;

public class Config {
	
	public static void level(Class<?> classe , Level level){
		Createur.getlog(classe).setLevel(level);
	}
	
	
   public static void addCible(Class<?> classe , String cible){
	   
	   Createur.getlog(classe).setCible(cible);
	}
   
public static void properties(String fileName){
	   
	   
	}

}
