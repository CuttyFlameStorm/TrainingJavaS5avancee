package fr.eni.jse.demo.tests;

import fr.eni.jse.demo.bo.Personne;
import fr.eni.jse.demo.bo.Vehicule;

public class TestsInterfaceClonable {

	public static void main(String[] args) {
		Vehicule voiture = new Vehicule(5);
		voiture.setConducteur(new Personne("Le conducteur"));
		voiture.addPassager(new Personne("Le passager n°1"));
		voiture.addPassager(new Personne("Le passager n°2"));

		//Interface de clonage
		try {
			Vehicule clone = voiture.clone();
			System.out.println("L'original : " + voiture.toString());
			System.out.println("Le clone : " + clone.toString());
			//verifier si le clonage est complet
			clone.setConducteur(new Personne("Le nouveau conducteur"));
			clone.getPassager(0).setNom("Le nouveau passager n°1");;
			clone.addPassager(new Personne("Le passager n°3"));
			System.out.println("L'original : " + voiture.toString());
			System.out.println("Le clone : " + clone.toString());
		} catch (CloneNotSupportedException e) { //Exception levée si la classe n'est pas marquée Clonable
			e.printStackTrace();
		}
	}

}
