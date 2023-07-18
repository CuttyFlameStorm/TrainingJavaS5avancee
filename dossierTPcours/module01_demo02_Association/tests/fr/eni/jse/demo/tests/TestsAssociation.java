package fr.eni.jse.demo.tests;

import java.time.LocalDate;
import java.util.Iterator;

import fr.eni.jse.demo.bo.Formation;
import fr.eni.jse.demo.bo.Promotion;
import fr.eni.jse.demo.bo.Stagiaire;

public class TestsAssociation {

	public static void main(String[] args) {
		
		//une formation
		Formation cda = new Formation("CDA", "Concepteur d'applications");
		//des stagiaires sans promotion
		Stagiaire julie = new Stagiaire("Bluth", "Julie", LocalDate.of(1999, 7, 20));
		Stagiaire jade = new Stagiaire("Bluth", "Jade", LocalDate.of(2005, 1, 15));
		//une promotion rattachée à une formation
		Promotion cda01 = new Promotion("CDA01", LocalDate.of(2023, 1, 15), LocalDate.of(2023, 7, 25), cda);
		//inscription des stagiaires à cette promotion (chaque stagiaire inscrit est associé automatiquement à cette promotion)
		cda01.addStagiaire(julie);
		cda01.addStagiaire(jade);
		
		//Vérification des associations
		System.out.println("Les données de la promotion CDA01");
		System.out.println(cda01.toString());
		System.out.println("Les données des stagiaires");
		System.out.println(julie.toString());
		System.out.println(jade.toString());
		System.out.println("Les inscrits à la promotion CDA01");
		Iterator<Stagiaire> iterator = cda01.getStagiaires();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}

	}

}
