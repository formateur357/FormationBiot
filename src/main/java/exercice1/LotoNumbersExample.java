package exercice1;

import java.util.ArrayList;
import java.util.List;

public class LotoNumbersExample {

	public static void main(String[] args) {

		// Créer une liste nommée 'lotoNumbers' et y ajouter des entiers
		List<Integer> lotoNumbers = new ArrayList<Integer>();
		lotoNumbers.add(5);
		lotoNumbers.add(12);
		lotoNumbers.add(23);
		lotoNumbers.add(34);
		lotoNumbers.add(45);
//		
//        List<Integer> list1 = List.of(1, 2, 3);
//        
        // Créer une liste immuable avec List.of()
//        List<Integer> immutableList = List.of(1, 2, 3);
//
//        // Créer une ArrayList mutable à partir de la liste immuable
//        List<Integer> mutableList = new ArrayList<Integer>(immutableList);

		// 1) Parcourir la liste avec une boucle while
		int index = 0;
		while (index < lotoNumbers.size()) {
			System.out.println("Boucle while : " + lotoNumbers.get(index));
			index++;
		}

		// 2) Parcourir la liste avec une boucle for
		for (int i = 0; i < lotoNumbers.size(); i++) {
			System.out.println("Boucle for : " + lotoNumbers.get(i));
		}

		// 3) Parcourir la liste avec un foreach
		for (Integer number : lotoNumbers) {
			System.out.println("Boucle foreach : " + number);
			System.out.println(" ");
		}
		
        // 4) Parcourir la liste avec la méthode forEach
        lotoNumbers.forEach(number -> {
        	System.out.println("Méthode forEach : " + number);
			System.out.println(" ");
        });
	}
}
