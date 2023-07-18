package fr.eni.interfacedrills.tests;

import INTERFACE.IAnimal;
import fr.eni.interfacedrills.modele.Centaure;
import fr.eni.interfacedrills.modele.Cheval;
import fr.eni.interfacedrills.modele.Humain;
import fr.eni.interfacedrills.modele.Oiseau;

public class TestsInterfaceDrills {

	public static void main(String[] args) {
		System.out.println("***** cheval *****");
		Cheval tornado = new Cheval();
		tornado.communiquer();
		tornado.dormir();
		tornado.galoper();
		
		System.out.println("***** humain *****");
		Humain zorro = new Humain();
		zorro.communiquer();
		zorro.dormir();
		zorro.siffler();
		
		// DECOMMENTER POUR LA QUESTION 6 		
		System.out.println("***** oiseau *****");
		Oiseau titi = new Oiseau();
		titi.siffler();
		titi.communiquer();
		titi.dormir();		
		
		
		IAnimal anonyme1 = tornado ; 
		anonyme1.communiquer() ; 
		IAnimal anonyme2 = zorro ; 
		anonyme2.communiquer() ;
		
		
		Humain inconnu = (Humain) anonyme2 ; 
		inconnu.siffler(); ;

		
		// test de Centaure !
		Centaure test = new Centaure();
		test.communiquer();
		test.dormir();
		test.manger();
		test.siffler();

	}

}
