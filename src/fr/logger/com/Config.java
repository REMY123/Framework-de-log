package fr.logger.com;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	public static void level(Class<?> classe , Level level){
		Createur.getlog(classe).setLevel(level);
	}
	
	
   public static void addCible(Class<?> classe , String cible){
	   
	   Createur.getlog(classe).setCible(cible);
	}
   
public static void properties(String fileName){
	
	
	 
	 /*Properties properties=new Properties();
	 try {
		 FileInputStream in =new FileInputStream(fileName);
		 properties.load(in);
		 in.close();
	 } catch (IOException e) {
		 System.err.println("Unable to load config file.");
	}*/
	
	
	
	
	
		// Cr�ation du flux buff�ris� sur un FileReader, imm�diatement suivi par un 
		// try/finally, ce qui permet de ne fermer le flux QUE s'il le reader
		// est correctement instanci� (�vite les NullPointerException)
	try{
		BufferedReader buff = new BufferedReader(new FileReader(fileName));
	}
	catch (IOException ioe) {
		// erreur de fermeture des flux
		System.out.println("Erreur --" + ioe.toString());
		}
}
}
