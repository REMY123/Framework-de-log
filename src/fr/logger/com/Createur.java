package fr.logger.com;

import java.util.HashSet;
import java.util.Iterator;

public class Createur {

	public static HashSet<Logger> hs = new HashSet<Logger>();

	public static Logger getlog(Class<?> classe) {

		// regarde si le log exste déja
		Iterator<Logger> iter = hs.iterator();
		while (iter.hasNext()) {
			Logger element = iter.next();
		
			if (element.getClasse().equals(classe)) {
				//System.out.println(element.getClasse()+" et "+ classe);
				return element;
			}
		}

		// s'il n'exite pas déja on le crée et on le rajoute a la liste
		Logger log = new Logger(classe);
		hs.add(log);
		// System.out.println(log.classe);

		return log;
	}

}
