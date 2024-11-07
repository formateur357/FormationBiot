package exercice4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestionFichiersFiltre {
    public static void main(String[] args) {
    	String fichierEntree = "/Users/morganguy/eclipse-workspace2.0/com.formation.projet-2-0.0.1-SNAPSHOT/src/main/java/exercice4/";
    	String fichierSortie = "/Users/morganguy/eclipse-workspace2.0/com.formation.projet-2-0.0.1-SNAPSHOT/src/main/java/exercice4/";
        try (// Scanner pour la saisie utilisateur
		Scanner scanner = new Scanner(System.in)) {
			// Demander le chemin du fichier d'entrée
			System.out.print("Entrez le chemin du fichier d'entrée : ");
			fichierEntree += scanner.nextLine();

			// Demander le chemin du fichier de sortie
			System.out.print("Entrez le chemin du fichier de sortie : ");
			fichierSortie += scanner.nextLine();

			// Demander le mot-clé pour filtrer les lignes
			System.out.print("Entrez le mot-clé pour filtrer les lignes : ");
			String motCle = scanner.nextLine();

			// Lire et écrire les fichiers avec filtrage
			try (
			    // Try-with-resources pour garantir la fermeture des flux
			    BufferedReader reader = new BufferedReader(new FileReader(fichierEntree));
			    BufferedWriter writer = new BufferedWriter(new FileWriter(fichierSortie))
			) {
			    String ligne;
			    int numeroLigne = 1;  // Compteur pour numéroter les lignes dans le fichier de sortie

			    System.out.println("\nLignes contenant le mot-clé '" + motCle + "' :");

			    // Lire le fichier ligne par ligne
			    while ((ligne = reader.readLine()) != null) {
			        // Vérifier si la ligne contient le mot-clé
			        if (ligne.contains(motCle)) {
			            // Afficher la ligne lue avec son numéro
			            System.out.println(numeroLigne + ". " + ligne);

			            // Écrire la ligne numérotée dans le fichier de sortie
			            writer.write(numeroLigne + ". " + ligne);
			            writer.newLine(); // Ajouter une nouvelle ligne dans le fichier

			            numeroLigne++; // Incrémenter le compteur de lignes
			        }
			    }

			    System.out.println("\nÉcriture terminée avec succès dans " + fichierSortie + ".");

			} catch (FileNotFoundException e) {
			    // Gérer le cas où le fichier d'entrée n'existe pas
			    System.err.println("Erreur : Le fichier d'entrée " + fichierEntree + " n'existe pas.");
			} catch (IOException e) {
			    // Gérer les erreurs de lecture/écriture
			    System.err.println("Erreur lors de la lecture ou de l'écriture : " + e.getMessage());
			}
		}
    }
}
