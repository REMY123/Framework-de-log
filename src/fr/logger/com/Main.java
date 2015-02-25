package fr.logger.com;

public class Main {
	
	public static void main(String[] args) {
		
		
		//Createur.getlog(Main.class);
		
		Logger log = Createur.getlog(Main.class);
		
		Level lev = Level.DEBUG;
		
		Cible c= new Cible();
		Cible d= new Cible();
		c.message="okkokokokok";
		
		Config.level(Main.class, lev);
		System.out.println(log.level);
		log.error("ok");
		System.out.println(log.level);
		Config.addCible(Main.class,c );
		Config.addCible(Main.class,c );
		Config.addCible(Main.class,c );
		Config.addCible(Main.class,d );
		
		log.error("ok");
		
		System.out.println(log.classe);
		System.out.println(log.cibles);
		
		
		
		
		
		
	
		
		
	}

}
