package exercice1_3;

/*

Exercice avancé : Transformation, calculs utilitaires et surcharge dans des formes géométriques

Vous allez étendre votre programme de formes géométriques avec des fonctionnalités supplémentaires pour pratiquer le polymorphisme, les interfaces et la surcharge de méthodes.

Instructions

Interface Transformable :

Créez une interface Transformable avec deux méthodes agrandir(double facteur) et reduire(double facteur).
Ces méthodes modifieront les dimensions de chaque forme en fonction d’un facteur.
Par exemple, un cercle avec un rayon de 5 devient un cercle de rayon 10 si on utilise agrandir(2).
Implémentez Transformable dans Cercle, Rectangle, Triangle, et TriangleEquilateral.

Classe CalculateurGeometrique :

Créez une classe utilitaire CalculateurGeometrique avec deux méthodes statiques :
static double aireTotale(Forme[] formes) : calcule l’aire totale d'un tableau de Forme.
static double perimetreTotal(Forme[] formes) : calcule le périmètre total d'un tableau de Forme.

Surcharge dans la classe Triangle :

Dans Triangle, ajoutez un constructeur pour les triangles isocèles, avec deux côtés égaux et un côté différent.
Ce constructeur prendra deux paramètres : la longueur des deux côtés égaux et la longueur du troisième côté.

Classe Main :

Testez les nouvelles fonctionnalités.
Créez des formes, transformez-les avec des facteurs différents, et calculez l’aire totale et le périmètre total de toutes les formes.

Exemple de sortie attendu :

Forme : Cercle
Aire : 78.54
Périmètre : 31.42

Forme : Rectangle
Aire : 28.0
Périmètre : 22.0

Aire totale avant transformation : 106.54
Périmètre total avant transformation : 53.42

Après transformation :

Forme : Cercle
Aire : 314.16
Périmètre : 62.83

Aire totale après transformation : 356.16
Périmètre total après transformation : 93.83

 */