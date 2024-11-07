package exercice1_3;

//Classe utilitaire pour calculs sur des ensembles de formes
public class CalculateurGeometrique {
 // Calcul de l'aire totale d'un tableau de formes
 public static double aireTotale(Forme[] formes) {
     double aireTotale = 0;
     for (Forme forme : formes) {
         aireTotale += forme.calculerAire();
     }
     return aireTotale;
 }

 // Calcul du périmètre total d'un tableau de formes
 public static double perimetreTotal(Forme[] formes) {
     double perimetreTotal = 0;
     for (Forme forme : formes) {
         perimetreTotal += forme.calculerPerimetre();
     }
     return perimetreTotal;
 }
}
