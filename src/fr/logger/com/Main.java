package fr.logger.com;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        
        
        
        Logger log = Createur.getlog(Main.class); // creer un log
        
        
        log.init();// initialisation du log avec valeur par defaut
        
        
        //Config.properties("a.properties",log); // parametres du log depuis le fichier properties
        
        
        
        System.out.println(log.messageDebug);
        System.out.println(log.messageError);
        System.out.println(log.messageInfo);
        System.out.println(log.level);
        
        
        HashSet<String> hs = Logger.cibles;
        Iterator<String> iter = hs.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element+" ");
        }
        
        log.show();// pour lancer l'ecriture sur les cibles.
        
        
        
        
        
        
        
    }
    
}
