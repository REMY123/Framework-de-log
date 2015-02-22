package fr.logger.com;



public class Logger {
	
	public static String [][] tabLevel= {{"DEBUG","1"},{"INFO","2"},{"ERROR","3"}};
	public static String [][] Copy = {{"DEBUG","1"},{"INFO","2"},{"ERROR","3"}};
	
	
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
	
	
	
	
}
