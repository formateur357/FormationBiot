package exercice1_2;

//Classe TriangleEquilateral qui hérite de Triangle
public class TriangleEquilateral extends Triangle {

 // Constructeur pour initialiser le côté du triangle équilatéral
 public TriangleEquilateral(double cote) {
     super(cote, cote, cote); // Tous les côtés sont de même longueur
 }

 // Calcul de l'aire d'un triangle équilatéral : (√3 / 4) * cote^2
 @Override
 public double calculerAire() {
     return (Math.sqrt(3) / 4) * coteA * coteA;
 }

 // Calcul du périmètre d'un triangle équilatéral : 3 * cote
 @Override
 public double calculerPerimetre() {
     return 3 * coteA;
 }
}
