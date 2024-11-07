package exercice1_2;

//Classe Triangle qui hérite de Polygone
public class Triangle extends Polygone {
 protected double coteA;
 protected double coteB;
 protected double coteC;

 // Constructeur pour initialiser les trois côtés du triangle
 public Triangle(double coteA, double coteB, double coteC) {
     super(3); // Un triangle a toujours 3 côtés
     this.coteA = coteA;
     this.coteB = coteB;
     this.coteC = coteC;
 }

 // Calcul de l'aire d'un triangle avec la formule de Heron
 @Override
 public double calculerAire() {
     double s = (coteA + coteB + coteC) / 2;
     return Math.sqrt(s * (s - coteA) * (s - coteB) * (s - coteC));
 }

 // Calcul du périmètre d'un triangle : somme des trois côtés
 @Override
 public double calculerPerimetre() {
     return coteA + coteB + coteC;
 }
}
