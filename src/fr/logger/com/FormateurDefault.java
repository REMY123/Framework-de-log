package fr.logger.com;

import java.text.DateFormat;
import java.util.Date;

public class FormateurDefault extends Formateur {

	static String message;
	Date maintenant = new Date();
	DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
			DateFormat.MEDIUM, DateFormat.MEDIUM);

	public String Formateur(Logger log, String MSG, Level lev) {

		StringBuilder buildMessage = new StringBuilder();
		buildMessage.append(mediumDateFormat.format(maintenant));
		buildMessage.append(" [NAME=" + log.classe);
		// System.out.println("Logger.class"+log.level);//////
		buildMessage.append("   LEVEL=" + lev);
		buildMessage.append("   MESSAGE=" + MSG);
		buildMessage.append("]");
		return buildMessage.toString();

	}

}