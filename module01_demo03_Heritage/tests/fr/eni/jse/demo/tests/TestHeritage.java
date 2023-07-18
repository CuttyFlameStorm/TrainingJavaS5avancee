package fr.eni.jse.demo.tests;

import java.time.LocalDate;
import java.util.List;

import fr.eni.jse.demo.bo.Alternant;
import fr.eni.jse.demo.bo.Continu;
import fr.eni.jse.demo.bo.Formation;
import fr.eni.jse.demo.bo.ModesFinancement;
import fr.eni.jse.demo.bo.Promotion;
import fr.eni.jse.demo.bo.Stagiaire;

public class TestHeritage {

	public static void main(String[] args) {
		//demo 01 - La classe Stagiaire n'est plus instanciable
		//Stagiaire jade = new Stagiaire();
		
		//demo 02 - Seules les classes dérivées sont instanciables.
		//une formation
		Formation cda = new Formation("CDA", "Concepteur d'applications");
		//différents types de stagiaires
		Alternant lauryne = new Alternant("Bluth", "Lauryne", LocalDate.of(1999, 7, 20), LocalDate.of(2023, 1, 2), "ENI Ecole");
		Continu lucie = new Continu("Bluth", "lucie", LocalDate.of(2005, 1, 15), ModesFinancement.REGION);
		//une promotion rattachée à une formation
		Promotion cda01 = new Promotion("CDA01", LocalDate.of(2023, 1, 15), LocalDate.of(2023, 7, 25), cda);
		//inscription des stagiaires à cette promotion (chaque stagiaire inscrit est associé automatiquement à cette promotion)
		cda01.addStagiaire(lauryne);
		cda01.addStagiaire(lucie);
		
		System.out.printf("Détail de la stagiaire Lauryne : %s%n", lauryne);
		System.out.printf("Détail de la stagiaire lucie : %s%n", lucie);
		
		//demo 03 - il est possible de constituer un annuaire de stagiaires
		//Puisqu'un type de base est capable de référencer un objet dérivé
		//On parle alors de transtypage ascendant
		List<Stagiaire> annuaire = List.of(lauryne, lucie);
		System.out.println("Annuaire des stagiaires");
		for (Stagiaire stagiaire : annuaire) { //Les objets de l'annuaire sont considérés comme des stagiaires
			System.out.println(stagiaire.toString()); //par polymorphisme, c'est la méthode la plus spécialisée qui est executée
			//les méthodes spécifiques aux type dérivées sont inaccessibles
			//stagiaires.getAge();
		}
		
		//Un élément de l'annuaire est vue comme un Stagiaire
		//le transtypage descendant permet de le recuperer sous son type d'origine
		//il est important de prendre quelques précautions avant d'effectuer ce transtypage
		if (annuaire.get(0) instanceof Alternant) {
			Alternant stagiaireRecupere = (Alternant)annuaire.get(0);
			System.out.println(stagiaireRecupere.toString());
			//les méthodes spécifiques aux type dérivées sont accessibles
			stagiaireRecupere.getAge();
		}
		
		//syntaxe possible depuis la version JDK14
		if (annuaire.get(1) instanceof Continu stagiaireRecupere) {
			System.out.println(stagiaireRecupere.toString());
			//les méthodes spécifiques aux type dérivées sont accessibles
			stagiaireRecupere.getAge();
		}
		
	}

}
