package fr.eni.jse.demo.dal;

import fr.eni.jse.demo.data.Personne;

//couplage faible (étape 1) : les classes Dao s'appuie sur l'interface afin de connaitre les prototypes des méthodes prises en charge
public class ClassBDao implements DaoInterface{
	/*
	public void save(Personne data) {
		System.out.printf("%s a été sauvegardée par la ClassBDao (source de données 1)", data);
	}
	*/

	@Override
	public void sauvegarder(Personne data) {
		System.out.printf("%s a été sauvegardée par la ClassBDao (source de données 1)", data);
		
	}

}
