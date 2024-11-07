package exercice1_2;

import exercice1_1.Forme;

//Classe abstraite Polygone, héritant de Forme, représentant les formes avec plusieurs côtés
public abstract class Polygone extends Forme {
 protected int nombreCotes;

 // Constructeur pour initialiser le nombre de côtés
 public Polygone(int nombreCotes) {
     this.nombreCotes = nombreCotes;
 }
}

