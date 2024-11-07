package exercice1_2;

//Classe Rectangle qui hérite de Polygone
public class Rectangle extends Polygone {
 private double longueur;
 private double largeur;

 // Constructeur pour initialiser longueur et largeur
 public Rectangle(double longueur, double largeur) {
     super(4); // Un rectangle a toujours 4 côtés
     this.longueur = longueur;
     this.largeur = largeur;
 }

 // Calcul de l'aire d'un rectangle : longueur * largeur
 @Override
 public double calculerAire() {
     return longueur * largeur;
 }

 // Calcul du périmètre d'un rectangle : 2 * (longueur + largeur)
 @Override
 public double calculerPerimetre() {
     return 2 * (longueur + largeur);
 }
}
