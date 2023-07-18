package fr.eni.jse.demo.tests;

import java.util.List;

import fr.eni.jse.demo.bo.Chat;
import fr.eni.jse.demo.bo.ChauveSouris;
import fr.eni.jse.demo.bo.Exocet;
import fr.eni.jse.demo.bo.Volant;

public class TestsInterface {

	public static void main(String[] args) {
		Chat c = new Chat();
		c.communiquer();

		ChauveSouris cs = new ChauveSouris();
		cs.communiquer();
		
		cs.voler();
		
		Volant cs2 = cs;
		cs2.voler();
		
		Exocet e = new Exocet();
		e.nager();
		e.voler();
		
		//appel à la méthode par défaut
		cs.monter(); //sans substitution
		e.monter(); //avec substitution
		
		//appel à la méthode static définie dans l'interface Volant
		Volant.staticMethod();
		
		//Transtypage ascendant avec le type interface
		List<Volant> mammiferesVolant = List.of(cs, e);
		for (Volant volant : mammiferesVolant) {
			System.out.println(volant.toString());
		}

	}

}
