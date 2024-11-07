package exercice1_1;

/*

Exercice : Formes géométriques

Nous devons modéliser des formes géométriques simples (cercle, rectangle et triangle) pour un programme de calcul d’aire et de périmètre. Pour ce faire, suivez les étapes ci-dessous.

Étapes

1. Créer une classe abstraite Forme :

Attributs : Elle ne contient aucun attribut propre, mais doit fournir deux méthodes abstraites : double calculerAire() et double calculerPerimetre().
Créer une classe Cercle qui hérite de Forme :

Attribut : rayon (de type double)
Constructeur : Initialise le rayon.
Implémentation des méthodes :
calculerAire()
calculerPerimetre() 

2. Créer une classe Rectangle qui hérite de Forme :

Attributs : longueur et largeur (de type double)
Constructeur : Initialise la longueur et la largeur.
Implémentation des méthodes :
calculerAire()
calculerPerimetre()

3. Créer une classe Triangle qui hérite de Forme :

Attributs : coteA, coteB, et coteC (de type double)
Constructeur : Initialise les trois côtés.
Implémentation des méthodes :
calculerAire() : Utilise la formule de Heron pour calculer l'aire.
calculerPerimetre().

4. Créer une classe principale Main pour tester le programme :

Créez un tableau de Forme qui contient un mélange de Cercle, Rectangle et Triangle.
Utilisez une boucle pour parcourir chaque Forme et afficher son aire et son périmètre.

*/