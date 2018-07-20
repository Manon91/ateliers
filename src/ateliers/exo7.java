package ateliers;
//Demander à l’utilisateur d’entrer le nombre 25. Il devra remplacer le cinquième élément du tableau.

import java.util.Scanner;

public class exo7 {

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
		//définir la fonction scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre");
		//stockage de la valeur
		int input = sc.nextInt();
		//remplacer et afficher la 5ème valeur
		tab[4] = input;
		System.out.println(tab[4]);
	}
	
	public static void main(String[] args) {
		numbers();
	}

}
