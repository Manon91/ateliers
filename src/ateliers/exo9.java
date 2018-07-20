package ateliers;
//Demander à l’utilisateur d’entrer un nombre entier. Le comparer au troisième élément du tableau.
//Si les nombres sont identiques, afficher “Bravo !”. Sinon, afficher “Perdu !”.

import java.util.Scanner;

public class exo9 {

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
		//Scanner pour entrer un nombre entier
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre entier");
		//Stocker la valeur
		int input = sc.nextInt();
		//Comparer le nombre au troisième élément
		if(input == tab[2]) {
			//SI c'est bon afficher bravo
			System.out.println("Bravo!");
		}
		//si c'est pas bon, afficher perdu
		else {
			System.out.println("Perdu!");
		}
	}

	public static void main(String[] args) {
		numbers();
	}

}