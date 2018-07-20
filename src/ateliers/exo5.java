package ateliers;

public class exo5 {

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
		//Afficher tous les éléments du tableau (en faisant une boucle).
		int i;
		for(i=0; i<8; i++) {
			System.out.println(tab[i]);
		}
	}

	public static void main(String[] args) {
		numbers();
	}

}
