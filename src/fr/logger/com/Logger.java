package fr.logger.com;

import java.util.HashSet;
import java.util.Iterator;



public class Logger {
	
	public static String [][] tabLevel= {{"DEBUG","1"},{"INFO","2"},{"ERROR","3"}};
	public static String [][] Copy = {{"DEBUG","1"},{"INFO","2"},{"ERROR","3"}};
	public static HashSet<String> hs = new HashSet<String>();
	
	static void error(String message){
		
		
		for(int i=0;i<tabLevel.length;i++)
		{
			if(tabLevel[i][0].equals("ERROR")){
				for(int j=i;j<tabLevel.length;j++)
				Formateur.message(message, tabLevel[j][0]);
			}
			
		}
		
	}
	
	static void info(String message){
		
		
		for(int i=0;i<tabLevel.length;i++)
		{
			if(tabLevel[i][0].equals("INFO")){
				for(int j=i;j<tabLevel.length;j++)
				Formateur.message(message, tabLevel[j][0]);
			}
			
		}
		
	}


	static void debug(String message){
	
	
	for(int i=0;i<tabLevel.length;i++)
	{
		if(tabLevel[i][0].equals("DEBUG")){
			for(int j=i;j<tabLevel.length;j++)
			Formateur.message(message, tabLevel[j][0]);
		}
		
	}
	
}
	
	static void defaultStettings(){
		
		Level.defaultLevel();
		
		}
	
	static void changeLevel(String level,String Inf,String Sup){
		
		Level.changeLevel(level, Inf, Sup);
		
	}
	
	static void ajoutCible(String cible){
		hs.add(cible);
		
	}
	
	static void deleteCible(String cible){
		
		Iterator<String> iter = hs.iterator();
		while (iter.hasNext()) {
		  String element = iter.next();
		  if ( element.equals(cible)) {
		    iter.remove();
		  }
		}
		
		
		
	}
	
	public static void afficheCible()
	{
		Iterator<String> it = hs.iterator();
		 while(it.hasNext())
		      {System.out.println(it.next());}
	}
	
	
}
