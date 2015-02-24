package fr.logger.com;

public class ConsoleCible extends Cible{

	@Override
	public void Envoyer(String message) {
		System.out.println(message);
		
	}

}
