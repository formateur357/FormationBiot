package exercice1_1;

//Classe abstraite Forme, représentant une forme géométrique de base
public abstract class Forme {
 // Méthode abstraite pour calculer l'aire de la forme
 // Doit être implémentée dans les sous-classes
 public abstract double calculerAire();

 // Méthode abstraite pour calculer le périmètre de la forme
 // Doit être implémentée dans les sous-classes
 public abstract double calculerPerimetre();
}
