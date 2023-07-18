package fr.eni.poodrills.tests;



import fr.eni.poodrills.modele.Forme;
import fr.eni.poodrills.modele.Rectangle;
import fr.eni.poodrills.modele.Triangle;

public class PooDrill04 {
	
	private static int TAILLE = 10;
	
	public static void main(String[] args) {
		Forme[] tabForme = new Forme[TAILLE];
		int index = 0;
		tabForme[index++] = new Triangle(22, 10);
		tabForme[index++] = new Rectangle(22, 10);
		tabForme[index++] = new Triangle(4, 125);
		tabForme[index++] = new Rectangle(4, 125);
		
		
		//Les lignes de codes suivantes doivent afficher
		/*
		Surface de : Triangle [largeur=22.0, hauteur=10.0] est 110.0
		Surface de : Rectangle [largeur=22.0, longueur=10.0] est 220.0
		Surface de : Triangle [largeur=4.0, hauteur=125.0] est 250.0
		Surface de : Rectangle [largeur=4.0, longueur=125.0] est 500.0
		*/
		for(int i=0;i<index;i++) {
			System.out.println("Surface de : " + tabForme[i].toString() + " est " + tabForme[i].calculerSurface());
		}
		
		//Comment faire pour garantir qu'un Triangle, Rectangle ou une autre
		//forme ait son implémentation propre ? 
		
		
	}

}
