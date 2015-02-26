package fr.logger.com;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    
    // changer le level
    public static void level(Class<?> classe , Level level){
        Createur.getlog(classe).setLevel(level);
    }
    
    
    // ajouter des cibles
    public static void addCible(Class<?> classe , String cible){
        
        Createur.getlog(classe).setCible(cible);
    }
    
    
    // Configuration du log avec le fichier properties
    public static void properties(String fileName, Logger log) throws ClassNotFoundException{
        int i;
        String l;
        
        
        Properties prop=new Properties();
        try {
            FileInputStream in =new FileInputStream(fileName);
            prop.load(in);
            
            
            // recupere le level et le mets dans log
            l=prop.getProperty("level");
            if(l.equals("ERROR"))
                log.setLevel(Level.ERROR);
            
            if(l.equals("INFO"))
                log.setLevel(Level.INFO);
            
            if(l.equals("DEBUG"))
                log.setLevel(Level.DEBUG);
            
            
            
            // recup les cibles et les mets dans log
            i=1;
            while(prop.getProperty("cible"+i)!=null){
                log.setCible( prop.getProperty("cible"+i));
                i++;
            }
            
            
            
            // recup les messages et les mets dans log
            log.setMessageDebug( prop.getProperty("debug"));
            log.setMessageInfo( prop.getProperty("info"));
            log.setMessageError( prop.getProperty("error"));
            
            
            in.close();
        } catch (IOException e) {
            System.err.println("Unable to load config file.");
        }
        
        
        
        
        
    }
}
