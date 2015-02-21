package fr.logger.com;

import java.util.Random;


public class Level extends Logger {
	
	public static void changeLevel(String level,String Inf,String Sup)
	{
		float nbSup;
		float nbInf;
		int endroit=0;
		float plusPetit=Float.parseFloat(tabLevel[0][1]);
		float plusGrand=Float.parseFloat(tabLevel[0][1]);
		
		
		 for(int i=0;i<tabLevel.length;i++)
		 {
			 if(Sup !=null && Sup.equals(tabLevel[i][0])){
				 Sup= tabLevel[i][1];
			 }
			 
			 if(Inf!=null && Inf.equals(tabLevel[i][0])){
				 Inf= tabLevel[i][1];
			 }
			 
			 if(Sup==null){
				 Sup=null;
			 }

			 if(Inf==null){
				 Inf=null;
			 }
			 
			 
			 if(level.equals(tabLevel[i][0])){
				 endroit=i;
			 }
			 
			 if(plusGrand<Float.parseFloat(tabLevel[i][1]))
			 {plusGrand=Float.parseFloat(tabLevel[i][1]);}
			 
			 if(plusPetit>Float.parseFloat(tabLevel[i][1]))
			 {plusPetit=Float.parseFloat(tabLevel[i][1]);}
		 }
		 
		 if(Sup==null){
			 tabLevel[endroit][1]=Float.toString(plusGrand+1);
		 }
		 
		 if(Inf==null){
			 for(int o=0;o<3;o++){
				 plusGrand=Float.parseFloat(tabLevel[o][1]);
				 plusGrand+=1;
				 tabLevel[o][1]=Float.toString(plusGrand);
			 }
			 tabLevel[endroit][1]=Float.toString(plusPetit);
		 }
		 
		 
		 
		 
		 if(Sup!=null && Inf !=null){
		 nbSup= Float.parseFloat(Sup);
		 nbInf= Float.parseFloat(Inf);
		 
		 Random rand = new Random();
		 float finalX = rand.nextFloat() * (nbSup - nbInf) + nbInf;
		 tabLevel[endroit][1]=Float.toString(finalX);
		 }
		 
		 trier();
		 
	}
	
	
	
	public static void affichage()
	{
		for(int p=0;p<tabLevel.length;p++)
		{
			
		
				System.out.print(tabLevel[p][0]+"       ");
			
			
			System.out.println("");
		}
	}
	
	
	
	public static void trier()
	{
		    int ordre =0;
		    int taille=tabLevel.length;
		    String tmp0;
		    String tmp1;
		    
		    
		    while(ordre==0)
		    {
		    	ordre=1;
		    	 for(int i=0 ; i < taille-1 ; i++)
		         {
		             if(Float.parseFloat(tabLevel[i][1]) > Float.parseFloat(tabLevel[i+1][1]))
		             {
		               
		                 tmp0=tabLevel[i][0];
		                 tabLevel[i][0]=tabLevel[i+1][0];
		                 tabLevel[i+1][0]=tmp0;
		                
		                 tmp1=tabLevel[i][1];
		                 tabLevel[i][1]=tabLevel[i+1][1];
		                 tabLevel[i+1][1]=tmp1;
		                 
		                 ordre = 0;
		             }
		         }
		         taille--;
		     }
		
	}
	
	
	
	static void defaultLevel()
	{
		for(int i=0;i<Copy.length;i++){
			for(int j=0;j<2;j++)
			{
				tabLevel[i][j]=Copy[i][j];
			}
			
		}
	}

}
