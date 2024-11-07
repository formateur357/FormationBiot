package exercice1_3;

public class Triangle extends Polygone implements Transformable {
    protected double coteA;
    protected double coteB;
    protected double coteC;

    // Constructeur pour triangle générique
    public Triangle(double coteA, double coteB, double coteC) {
        super(3);
        this.coteA = coteA;
        this.coteB = coteB;
        this.coteC = coteC;
    }

    // Surcharge du constructeur pour triangle isocèle (deux côtés égaux)
    public Triangle(double coteEgaux, double coteDifferent) {
        this(coteEgaux, coteEgaux, coteDifferent);
    }

    @Override
    public double calculerAire() {
        double s = (coteA + coteB + coteC) / 2;
        return Math.sqrt(s * (s - coteA) * (s - coteB) * (s - coteC));
    }

    @Override
    public double calculerPerimetre() {
        return coteA + coteB + coteC;
    }

    @Override
    public void agrandir(double facteur) {
        coteA *= facteur;
        coteB *= facteur;
        coteC *= facteur;
    }

    @Override
    public void reduire(double facteur) {
        coteA /= facteur;
        coteB /= facteur;
        coteC /= facteur;
    }
}
