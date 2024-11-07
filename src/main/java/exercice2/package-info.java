package exercice2;

/* Enonce :

Une petite entreprise de produits chimiques souhaite informatiser la gestion du calcul du salaire de ses employés. Cet exercice a pour but la réflexion et la pratique autour des problématiques de programmation orientées objets. En effet, afin permettre à cette entreprise d'informatiser le calcul des salaires, il faut tout d'abord construire une hiérarchie d'objets permettant de représenter ses salariés.

Lors de votre entretien avec le directeur, vous notez les contraintes suivantes :

Tout employé est caractérisé par son nom, son prénom, son âge, et sa date d'entrée en service
Tout employé a un salaire mensuel calculé selon le poste qu'il occupe dans l'entreprise

Les types d'employés

Vendeur : Son salaire est calculé avec 20% du chiffre d'affaire qu'il a effectué dans le mois, plus une prime fixe de 400€
Représentant : Son salaire est calculé avec 20% du chiffre d'affaire qu'il a effectué dans le mois, plus une prime fixe de 800€
Producteur : Son salaire est calculé avec le nombre d'unités produites dans le mois multiplié par un taux fixe de 5€
Manutentionnaire : Son salaire est calculé avec le nombre d'heures effectuées dans le mois multiplié par un taux fixe de 65€

Certains employés des secteurs production et manutention sont appelés à manipuler des produits dangereux
Une prime fixe de 200€ est ajoutée à leur salaire mensuel.

Le programme doit permettre de gérer une collection d'employés à partir de laquelle on peut afficher de détails des salaires de chaque employé, mais aussi le salaire moyen.

Le code suivant doit permettre de tester le programme :

public class Main {
  public static void main(final String[] args) {
    final Staff myEmployees = new Staff();
    myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
    myEmployees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
    myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
    myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
    myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
    myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));
    
    myEmployees.displaySalaries();
    myEmployees.displayAverageSalary();
  }
}

Résultat attendu :

Liste des salaires des employés :
	L'employé Pierre Business a un salaire de 6400 €
	L'employé Léon Ventout a un salaire de 4800 €
	L'employé Yves Ahalouest a un salaire de 5000 €
	L'employé Jeanne Stoktout a un salaire de 2925 €
	L'employé Jean Flippe a un salaire de 5200 €
	L'employé Al Abordage a un salaire de 3125 €

Valeur du salaire moyen : 4575 €
*/