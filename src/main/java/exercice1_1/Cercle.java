package exercice1_1;

//Classe Cercle qui hérite de Forme
public class Cercle extends Forme {
 // Attribut spécifique au cercle : le rayon
 private double rayon;

 // Constructeur de la classe Cercle
 // Initialise le rayon avec la valeur donnée
 public Cercle(double rayon) {
     this.rayon = rayon;
 }

 // Implémentation de la méthode calculerAire() pour le cercle
 @Override
 public double calculerAire() {
     // Aire d'un cercle = π * rayon^2
     return Math.PI * rayon * rayon;
 }

 // Implémentation de la méthode calculerPerimetre() pour le cercle
 @Override
 public double calculerPerimetre() {
     // Périmètre d'un cercle = 2 * π * rayon
     return 2 * Math.PI * rayon;
 }
}

