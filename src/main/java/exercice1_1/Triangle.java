package exercice1_1;

//Classe Triangle qui hérite de Forme
public class Triangle extends Forme {
 // Attributs spécifiques au triangle : les trois côtés
 private double coteA;
 private double coteB;
 private double coteC;

 // Constructeur de la classe Triangle
 // Initialise les côtés avec les valeurs données
 public Triangle(double coteA, double coteB, double coteC) {
     this.coteA = coteA;
     this.coteB = coteB;
     this.coteC = coteC;
 }

 // Implémentation de la méthode calculerAire() pour le triangle
 @Override
 public double calculerAire() {
     // Utilisation de la formule de Heron pour calculer l'aire d'un triangle
     double s = (coteA + coteB + coteC) / 2; // Demi-périmètre
     // Aire = √(s * (s - coteA) * (s - coteB) * (s - coteC))
     return Math.sqrt(s * (s - coteA) * (s - coteB) * (s - coteC));
 }

 // Implémentation de la méthode calculerPerimetre() pour le triangle
 @Override
 public double calculerPerimetre() {
     // Périmètre d'un triangle = somme des trois côtés
     return coteA + coteB + coteC;
 }
}

