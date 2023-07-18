package fr.eni.jse.demo.tests;

import java.time.LocalDate;

import fr.eni.jse.demo.bo.Stagiaire;

public class TestsClasse {

	public static void main(String[] args) {
		// demo 01 - instanciation à partir du constructeur par défaut
		Stagiaire jade = new Stagiaire();
		// demo 02 - changement de l'état de l'objet
		jade.setNom("Bluth");
		jade.setPrenom("Jade");
		jade.setDateNaissance(LocalDate.of(2005, 1, 15));
		
		// demo 03 - instanciation à partir du constructeur surchargé
		Stagiaire julie = new Stagiaire("Bluth", "Julie", LocalDate.of(1999, 7, 20));
		
		// demo 04 - manipuler l'objet
		System.out.println(jade.toString());
		System.out.println(julie.toString());
		
		// demo 05 - comparer les objets (redéfinition de la méthode equals)
		Stagiaire jade2 = jade; //jade2 référence l'instance de jade
		Stagiaire jade3 = new Stagiaire(jade.getNom(), jade.getPrenom(), jade.getDateNaissance()); //jade3 est une nouvelle instance contenant les mêmes données que jade
		System.out.printf("hashcode de jade : %s%n", jade.hashCode());
		System.out.printf("hashcode de jade2 : %s%n", jade2.hashCode());
		System.out.printf("hashcode de jade3 : %s%n", jade3.hashCode());
		System.out.println(jade.equals(jade2) ? "Jade et Jade2 sont égaux !" : "Jade et Jade2 sont différents !");
		System.out.println(jade.equals(jade3) ? "Jade et Jade3 sont égaux !" : "Jade et Jade3 sont différents !");
		System.out.println(jade.equals(julie) ? "Jade et Julie sont égaux !" : "Jade et Julie sont différents !");

		// demo 06 - changeons l'état de jade2 (redéfinition de la méthode hashcode)
		//faire le test avant la redéfinition de la méthode
		jade3.setNom("Jade3");
		System.out.printf("hashcode de jade3 après modification du nom : %s%n", jade3.hashCode());
		System.out.println(jade.equals(jade3) ? "Jade et Jade3 sont égaux !" : "Jade et Jade3 sont différents !");
	}

}
