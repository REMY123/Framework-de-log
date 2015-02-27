package fr.logger.com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCible {

	public static void cible(String message, String file) {

		FileWriter writer = null;
		try {

			writer = new FileWriter(file, true);

		} catch (IOException e) {
			System.out.println("CIBLE: " + file + " NON VALIDE");
		}

		if (writer != null) {
			try {

				writer.write("\n" + message, 0, message.length());
			} catch (IOException e) {

			}

			finally {

				try {
					writer.close();
				} catch (IOException e) {

					e.printStackTrace();
				}

			}

		}

	}

}