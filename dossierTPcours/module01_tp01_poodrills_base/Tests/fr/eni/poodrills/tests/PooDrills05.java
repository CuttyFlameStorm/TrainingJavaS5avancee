package fr.eni.poodrills.tests;

import fr.eni.poodrills.modele.Personne;

public class PooDrills05 {
	
	private static int TAILLE = 10;
	
	public static void main(String[] args) {
		Personne[] tabPersonnes = new Personne[TAILLE];
		int index = 0;
		tabPersonnes[index++] = new Personne(1, "bob");
		tabPersonnes[index++] = new Personne(2, "jim");
		tabPersonnes[index++] = new Personne(3, "jane");
		tabPersonnes[index++] = new Personne(4, "jason");
		
		
		//Ajouter le code nécessaire pour que la console affiche :
		//"La personne Personne [noPersonne=3, nom=jane] est dans la liste !"
		boolean trouve = false;
		int i = 0;
		Personne persCherchee = new Personne(3, "jane");
		
		while(!trouve && i < index) {
			if(tabPersonnes[i].equals(persCherchee)) {
				System.out.println("La personne " + persCherchee + " est dans la liste !");
				trouve = true;
			}
			i++;
		}
		if(!trouve) {
			System.out.println("La personne n'est pas dans la liste");
		}
		
		
		
		
	}

}
