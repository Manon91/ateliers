package ateliers;
//Demander à l’utilisateur d’entrer un nombre entier et stocker sa valeur dans une variable nommée input.
import java.util.Scanner;

public class exo6 {

	public static void numbers() {
		//créer le tableau et lui donner une taille
		int[] tab = new int[8];
		//remplir le tableau
		tab [0] = 12;
		tab [1] = 15;
		tab [2] = 13;
		tab [3] = 10;
		tab [4] = 8;
		tab [5] = 9;
		tab [6] = 13;
		tab [7] = 14;
		//déclarer et utiliser le scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre");
		//stockage de la valeur
		int input = sc.nextInt();
		System.out.println("Vous avez saisi " + input);
	}
	
	public static void main(String[] args) {
		numbers();
	}

}
