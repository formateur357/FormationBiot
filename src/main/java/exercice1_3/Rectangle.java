package exercice1_3;

public class Rectangle extends Polygone implements Transformable {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        super(4);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerAire() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    @Override
    public void agrandir(double facteur) {
        longueur *= facteur;
        largeur *= facteur;
    }

    @Override
    public void reduire(double facteur) {
        longueur /= facteur;
        largeur /= facteur;
    }
}
