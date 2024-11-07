package exercice1_3;

public class Main {
    public static void main(String[] args) {
        Forme[] formes = new Forme[] {
            new Rectangle(4, 7),
            new Cercle(5),
            new Triangle(3, 4, 5),
            new TriangleEquilateral(6)
        };

        System.out.println("Aire totale avant transformation : " + CalculateurGeometrique.aireTotale(formes));
        System.out.println("Périmètre total avant transformation : " + CalculateurGeometrique.perimetreTotal(formes));

        // Appliquer la transformation (agrandir) à chaque forme
        for (Forme forme : formes) {
            if (forme instanceof Transformable) {
                ((Transformable) forme).agrandir(2);
            }
        }

        System.out.println("\nAprès transformation :");
        System.out.println("Aire totale après transformation : " + CalculateurGeometrique.aireTotale(formes));
        System.out.println("Périmètre total après transformation : " + CalculateurGeometrique.perimetreTotal(formes));
    }
    
}
