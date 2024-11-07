package exercice1_2;

/*

Exercice : Chaîne d'héritage et polymorphisme avec des formes géométriques

Vous allez construire un programme en Java qui modélise différentes formes géométriques pour calculer leurs aires et périmètres. Cet exercice vous aidera à comprendre l'héritage et le polymorphisme en créant une hiérarchie de classes.

Objectif

Créez des classes qui représentent des formes géométriques de base avec un niveau intermédiaire dans la chaîne d'héritage.
Utilisez le polymorphisme pour calculer les aires et périmètres de ces formes en utilisant un tableau de type Forme.

Instructions

Classe Forme (classe abstraite) :

Créez une classe abstraite Forme qui représente une forme géométrique générique.
Elle doit inclure deux méthodes abstraites : double calculerAire() et double calculerPerimetre().

Classe Polygone (classe abstraite intermédiaire) :

Créez une classe Polygone qui hérite de Forme et représente les formes ayant plusieurs côtés.
Polygone doit avoir un attribut int nombreCotes pour stocker le nombre de côtés.

Classe Cercle :

Créez une classe Cercle qui hérite de Forme.
Elle doit avoir un attribut rayon et un constructeur pour l'initialiser.
Implémentez les méthodes calculerAire() et calculerPerimetre() pour un cercle.

Classe Rectangle :

Créez une classe Rectangle qui hérite de Polygone.
Elle doit avoir des attributs longueur et largeur et un constructeur pour les initialiser.
Implémentez les méthodes calculerAire() et calculerPerimetre() pour un rectangle.

Classe Triangle :

Créez une classe Triangle qui hérite de Polygone.
Elle doit avoir des attributs coteA, coteB, et coteC pour les trois côtés et un constructeur pour les initialiser.
Implémentez les méthodes calculerAire() (utilisez la formule de Heron) et calculerPerimetre() pour un triangle.

Classe TriangleEquilateral :

Créez une classe TriangleEquilateral qui hérite de Triangle.
Elle doit avoir un seul attribut cote (puisque tous les côtés sont égaux) et un constructeur pour l'initialiser.
Redéfinissez les méthodes calculerAire() et calculerPerimetre() avec les formules spécifiques pour un triangle équilatéral.

Classe Main :

Créez une classe Main pour tester votre programme.
Déclarez un tableau de Forme qui contient des instances de Cercle, Rectangle, Triangle et TriangleEquilateral.
Utilisez une boucle pour afficher l'aire et le périmètre de chaque forme.

Exemple de sortie attendu :

Forme : Cercle
Aire : 78.54
Périmètre : 31.42

Forme : Rectangle
Aire : 28.0
Périmètre : 22.0

Forme : Triangle
Aire : 6.0
Périmètre : 12.0

Forme : TriangleEquilateral
Aire : 15.59
Périmètre : 18.0

*/