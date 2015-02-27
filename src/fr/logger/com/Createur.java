package fr.logger.com;

import java.util.HashSet;
import java.util.Iterator;

public class Createur {

	public static HashSet<Logger> hs = new HashSet<Logger>();

	public static Logger getlog(Class<?> classe) {

		// regarde si le log exste deja
		Iterator<Logger> iter = hs.iterator();
		while (iter.hasNext()) {
			Logger element = iter.next();

			if (element.getClasse().equals(classe)) {
				return element;
			}
		}

		// s'il n'exite pas deja on le cree et on le rajoute a la liste
		Logger log = new Logger(classe);
		hs.add(log);

		return log;
	}

}
