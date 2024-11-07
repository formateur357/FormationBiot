package exercice1_3;

public class Cercle extends Forme implements Transformable {
    private double rayon;

    public Cercle(double rayon) {
    	super();
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    // Méthode pour agrandir le rayon du cercle
    @Override
    public void agrandir(double facteur) {
        rayon *= facteur;
    }

    // Méthode pour réduire le rayon du cercle
    @Override
    public void reduire(double facteur) {
        rayon /= facteur;
    }
}
