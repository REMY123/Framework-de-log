package fr.logger.com;

import java.util.HashSet;


public class Logger {
    //Attributs
    public Class<?> classe;
    public Level level;
    public String messageError;
    public String messageInfo;
    public String messageDebug;
    public static HashSet<String> cibles= new HashSet<String>();
    
    
    public Logger(Class<?> maClasse) {
        this.classe = maClasse;
    }
    
    public Class<?> getClasse() {
        return classe;
    }
    
    //Accessseurs
    public String getMessageError() {
        return messageError;
    }
    
    
    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }
    
    
    public String getMessageInfo() {
        return messageInfo;
    }
    
    
    public void setMessageInfo(String messageInfo) {
        this.messageInfo = messageInfo;
    }
    
    
    public String getMessageDebug() {
        return messageDebug;
    }
    
    
    public void setMessageDebug(String messageDebug) {
        this.messageDebug = messageDebug;
    }
    
    public void setCible(String cible) {
        
        cibles.add(cible);
    }
    
    
    
    public Level getLevel() {
        return level;
    }
    
    public void setLevel(Level level) {
        this.level = level;
    }
    ////////////////////////////
    
    
    
    
    public void error(String message){
        this.messageError=message;
        
    }
    
    public void info(String message){
        
        this.messageInfo=message;
    }
    
    public void debug(String message){
        
        this.messageDebug=message;
    }
    
    
    //initialise le log
    public void init(){
        this.messageError="ceci est un message d'Erreur par défaut";
        this.messageDebug="ceci est un message de debug par défaut";
        this.messageInfo="ceci est un message d'info par défaut";
        this.level=Level.DEBUG;
        this.setCible("Console");
    }
    
    // lance l'écriture dans les cible
    public void show() {
        
        
        
    }
    
    
    
    
}


