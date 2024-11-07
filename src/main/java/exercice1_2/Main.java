package exercice1_2;

import exercice1_1.Forme;

//Classe principale pour tester les calculs des formes
public class Main {
 public static void main(String[] args) {
     // Création d'un tableau de Forme pour démontrer le polymorphisme
     Forme[] formes = new Forme[] {
         new Cercle(5),
         new Rectangle(4, 7),
         new Triangle(3, 4, 5),
         new TriangleEquilateral(6)
     };

     // Parcours du tableau pour afficher l'aire et le périmètre de chaque forme
     for (Forme forme : formes) {
         System.out.println("Forme : " + forme.getClass().getSimpleName());
         System.out.println("Aire : " + forme.calculerAire());
         System.out.println("Périmètre : " + forme.calculerPerimetre());
         System.out.println();
     }
 }
}
