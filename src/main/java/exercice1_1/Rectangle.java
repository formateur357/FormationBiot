package exercice1_1;

//Classe Rectangle qui hérite de Forme
public class Rectangle extends Forme {
 // Attributs spécifiques au rectangle : longueur et largeur
 private double longueur;
 private double largeur;

 // Constructeur de la classe Rectangle
 // Initialise la longueur et la largeur avec les valeurs données
 public Rectangle(double longueur, double largeur) {
     this.longueur = longueur;
     this.largeur = largeur;
 }

 // Implémentation de la méthode calculerAire() pour le rectangle
 @Override
 public double calculerAire() {
     // Aire d'un rectangle = longueur * largeur
     return longueur * largeur;
 }

 // Implémentation de la méthode calculerPerimetre() pour le rectangle
 @Override
 public double calculerPerimetre() {
     // Périmètre d'un rectangle = 2 * (longueur + largeur)
     return 2 * (longueur + largeur);
 }
}
