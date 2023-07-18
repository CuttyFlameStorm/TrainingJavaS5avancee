package fr.eni.poodrills.tests;



import fr.eni.poodrills.modele.Forme;
import fr.eni.poodrills.modele.Rectangle;

public class PooDrill03 {

	public static void main(String[] args) {

		//Créer une classe Rectangle pour que le 
		//code ci-dessous compile
		Forme rect = new Rectangle(12, 12);
		
		//Calculer et afficher la surface du rectangle
		System.out.println("Surface du rectangle = " + rect.calculerSurface());

	}

}
