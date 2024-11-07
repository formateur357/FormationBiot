package exercice3;

public class NegativeNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
     * Constructeur de l'exception personnalisée.
     * @param message Le message d'erreur à afficher.
     */
    public NegativeNumberException(String message) {
        super(message); // Appelle le constructeur de la classe parente Exception
    }
}
