package exercice1_1;

//Classe principale Main pour exécuter et tester le programme
public class Main {
 public static void main(String[] args) {
     // Création d'un tableau de Forme contenant différentes instances de formes géométriques
     Forme[] formes = new Forme[] {
         new Cercle(5),         // Création d'un cercle de rayon 5
         new Rectangle(4, 7),   // Création d'un rectangle de longueur 4 et largeur 7
         new Triangle(3, 4, 5)  // Création d'un triangle avec des côtés de 3, 4 et 5
     };

     // Boucle pour afficher l'aire et le périmètre de chaque forme dans le tableau
     for (Forme forme : formes) {
         // Affichage du type de forme (nom de la classe)
         System.out.println("Forme : " + forme.getClass().getSimpleName());
         // Appel de la méthode calculerAire() polymorphique pour obtenir l'aire
         System.out.println("Aire : " + forme.calculerAire());
         // Appel de la méthode calculerPerimetre() polymorphique pour obtenir le périmètre
         System.out.println("Périmètre : " + forme.calculerPerimetre());
         System.out.println(); // Ligne vide pour séparer les informations des formes
     }
 }
}
