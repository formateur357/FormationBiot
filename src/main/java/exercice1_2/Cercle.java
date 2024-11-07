package exercice1_2;

import exercice1_1.Forme;

//Classe Cercle qui hérite de Forme
public class Cercle extends Forme {
 private double rayon;

 // Constructeur pour initialiser le rayon
 public Cercle(double rayon) {
     this.rayon = rayon;
 }

 // Calcul de l'aire d'un cercle : π * rayon^2
 @Override
 public double calculerAire() {
     return Math.PI * rayon * rayon;
 }

 // Calcul du périmètre d'un cercle : 2 * π * rayon
 @Override
 public double calculerPerimetre() {
     return 2 * Math.PI * rayon;
 }
}

