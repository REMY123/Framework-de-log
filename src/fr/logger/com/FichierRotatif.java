package fr.logger.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.text.DateFormat;
import java.util.Date;

public class FichierRotatif {

	public static void rotatif(String message, String place) {

		File fichier = new File(place);

		Date maintenant = new Date();
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);

		int nblignes = 0;
		String ligne;

		try {
			// Création du fichier
			fichier.createNewFile();

			// Création du writer
			FileWriter writer = new FileWriter(fichier, true);
			try {
				writer.write(message + "\n");

			} finally {
				// On ferme le fichier
				writer.close();
			}

			BufferedReader lecture = new BufferedReader(new FileReader(place));

			while ((ligne = lecture.readLine()) != null) {
				nblignes = nblignes + 1;
			}

			for (int i = nblignes; i > 20; i--) {
				try {

					File fichier1 = new File(place);
					RandomAccessFile remp = new RandomAccessFile(fichier1, "rw"); // (lecture-écriture)
					remp.readLine();
					long length = remp.length() - (remp.getFilePointer()); // on
																			// saute
																			// la
																			// première
																			// ligne.
					byte[] suivant = new byte[(int) length];
					remp.readFully(suivant); // lecture de toute la suite du
												// fichier
					remp.seek(0); // on repars au début
					remp.write(suivant); // insertion d'une ligne
					remp.setLength(suivant.length);
					remp.close();

				} catch (Exception error) {
					error.printStackTrace();
				}
			}

		} catch (Exception e) {
			System.out.println("Impossible de creer le fichier");
		}

	}

}