package fr.logger.com;

public class ConsoleCible extends Cible{

	@Override
	public void Envoyer(String message, String className) {
		System.out.println("ERROR	|	" + className + "	|	" + message);
	}

}
