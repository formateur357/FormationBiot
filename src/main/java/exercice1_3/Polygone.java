package exercice1_3;

//Classe abstraite Polygone, héritant de Forme, représentant les formes avec plusieurs côtés
public abstract class Polygone extends Forme {
 protected int nombreCotes;

 // Constructeur pour initialiser le nombre de côtés
 public Polygone(int nombreCotes) {
	 super();
     this.nombreCotes = nombreCotes;
 }
}

