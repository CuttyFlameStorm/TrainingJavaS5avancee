package fr.eni.jse.demo.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import fr.eni.jse.demo.bll.ClassAManager;
import fr.eni.jse.demo.data.Personne;

public class TestsInterface {

	public static void main(String[] args) {
		
		//demo 01 - la ségrégation d'interface
		//Seules les fonctionnalités pour parcourir la liste sont accessibles
		//Iterable maListe = new ArrayList<>();
		
		//Les fonctionnalités pour gérer le contenu de la liste sont accessibles
		//(ajouter, supprimer, parcourir, ...)
		//Collection maListe = new ArrayList<>();
		
		//La liste devient en plus triable
		//List maListe = new ArrayList<>();
		
		
		//demo 02 - mise en oeuvre du couplage flaible (inversion de dépendance)
		Personne felix = new Personne(1L, "Bluth", "Felix", "felix@mail.com", 17);
		
		ClassAManager mgr = new ClassAManager();
		mgr.persister(felix);

	}

}
