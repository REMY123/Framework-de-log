package fr.logger.com;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCible extends Cible {
	
    
	@Override
	public void Envoyer(String message) {
		// TODO Auto-generated method stub
		try {
			
            BufferedWriter out = new BufferedWriter(new FileWriter(new File("fichier.txt")));
          
            try {
                 out.write(message);  
            } 
            
            finally {
                      out.close();
            }
          
         } 
		catch (IOException e) {
                 e.printStackTrace();
         }
      
      
  }

}
		

