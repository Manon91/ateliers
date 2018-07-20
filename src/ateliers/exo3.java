package ateliers;

//on va travailler avec un tableau d’entiers appelé tab contenant les valeurs suivantes :
//12, 15, 13, 10, 8, 9, 13 et 14.

public class exo3 {

	public static void numbers() {
		
	}
	
	public static void main(String[] args) {
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
		//Modifier le cinquième élément du tableau pour lui attribuer la valeur 5 et l’afficher.
		tab [4] = 5;
		System.out.println(tab[4]);
	}

}
