package fr.eni.jse.demo.dal;

import fr.eni.jse.demo.data.Personne;

//Interface d'harmonisation des méthodes des classDao 
//(toute ces classes servent à persister une Personne mais dans des sources de données différentes)
/**
 * 
 * @author bmartin
 *
 */
public interface DaoInterface {
	void sauvegarder(Personne data);
}
