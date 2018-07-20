package ateliers;

public class exo4 {

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
		//Afficher tous les éléments du tableau (sans faire de boucle).
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[2]);
		System.out.println(tab[3]);
		System.out.println(tab[4]);
		System.out.println(tab[5]);
		System.out.println(tab[6]);
		System.out.println(tab[7]);
	}
	
	public static void main(String[] args) {
		numbers();
	}

}
