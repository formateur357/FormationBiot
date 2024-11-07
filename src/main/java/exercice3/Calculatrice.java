package exercice3;

public class Calculatrice {
    public static void main(String[] args) {
        // Testez ici les différentes opérations et les exceptions
        System.out.println("Addition :");
        calculer("10", "2", "+"); // Exemple d'addition
        System.out.println("\nDivision par zéro :");
        calculer("10", "0", "/"); // Exemple de division par zéro
        System.out.println("\nFormat de nombre incorrect :");
        calculer("10", "abc", "-"); // Exemple de format incorrect
        System.out.println("\nNombre négatif :");
        calculer("-5", "3", "*"); // Exemple de nombre négatif
    }

    /**
     * Méthode pour effectuer un calcul entre deux nombres avec gestion des exceptions.
     * @param a Le premier nombre sous forme de chaîne.
     * @param b Le deuxième nombre sous forme de chaîne.
     * @param operateur L'opérateur pour l'opération (ex: "+", "-", "*", "/").
     */
    public static void calculer(String a, String b, String operateur) {
        try {
            // Conversion des chaînes en nombres entiers
            int nombre1 = Integer.parseInt(a);
            int nombre2 = Integer.parseInt(b);

            // Vérification pour détecter des nombres négatifs
            if (nombre1 < 0 || nombre2 < 0) {
                throw new NegativeNumberException("Erreur : Les nombres négatifs ne sont pas autorisés.");
            }

            int resultat = 0;

            // Effectuer l'opération en fonction de l'opérateur
            switch (operateur) {
                case "+":
                    resultat = nombre1 + nombre2; // Addition
                    break;
                case "-":
                    resultat = nombre1 - nombre2; // Soustraction
                    break;
                case "*":
                    resultat = nombre1 * nombre2; // Multiplication
                    break;
                case "/":
                    resultat = nombre1 / nombre2; // Division (peut lancer une exception si divisé par zéro)
                    break;
                default:
                    System.out.println("Erreur : Opérateur non valide. Veuillez utiliser +, -, *, ou /.");
                    return; // Fin de méthode si opérateur invalide
            }

            // Affichage du résultat
            System.out.println("Résultat : " + resultat);

        } catch (ArithmeticException e) {
            // Gestion de la division par zéro
            System.out.println("Erreur : Division par zéro.");
        } catch (NumberFormatException e) {
            // Gestion des entrées non valides (par ex. "abc" au lieu de nombres)
            System.out.println("Erreur : Format de nombre incorrect. Veuillez entrer des nombres valides.");
        } catch (NegativeNumberException e) {
            // Gestion de l'exception personnalisée pour les nombres négatifs
            System.out.println(e.getMessage());
        }
    }
}
