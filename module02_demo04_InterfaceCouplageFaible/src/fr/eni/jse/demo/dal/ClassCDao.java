package fr.eni.jse.demo.dal;

import fr.eni.jse.demo.data.Personne;

//couplage faible (étape 1) : les classes Dao s'appuie sur l'interface afin de connaitre les prototypes des méthodes prises en charge
public class ClassCDao implements DaoInterface {
	@Override
	public void sauvegarder(Personne data) {
		System.out.printf("%s a été sauvegardée par la ClassCDao (source de données 2)", data);
	}

}
