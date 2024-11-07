package Exemple;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Classe principale pour écrire des objets dans un fichier
public class PersonneIOMainWrite implements Serializable {
    private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
        // Création des objets PersonneIO
        PersonneIO p1 = new PersonneIO();
        p1.setNom("JFL");

        PersonneIO p2 = new PersonneIO();
        p2.setAdresse("?");

        // Chemin du fichier de sortie
        String filePath = "file.out";

        // Ecriture des objets dans un fichier
        try (
        		FileOutputStream fos = new FileOutputStream(filePath);
        		ObjectOutputStream oos = new ObjectOutputStream(fos)
        	) {

            // Ecriture des objets dans le flux
            oos.writeObject(p1);
            oos.writeObject(p2);

            System.out.println("Les objets ont été écrits dans le fichier : " + filePath);
        } catch (FileNotFoundException e) {
            System.err.println("Fichier non trouvé : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erreur d'entrée/sortie : " + e.getMessage());
        }
    }
}

