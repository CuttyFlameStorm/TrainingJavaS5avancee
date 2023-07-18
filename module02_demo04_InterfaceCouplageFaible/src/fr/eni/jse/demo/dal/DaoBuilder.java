package fr.eni.jse.demo.dal;

import fr.eni.jse.demo.tools.ConfigReader;

//couplage faible (étape 3) : La Fabrique se charge de diffuser l'instance de classDao prévue par le fichier de config
public abstract class DaoBuilder {
	public static DaoInterface createInstance() {
		DaoInterface dao = null;
		String datasource = ConfigReader.getPropertieValue("datasource");
		switch (datasource.toUpperCase()) {
		case "B" :
			dao = new ClassBDao();
			break;
		case "C" :
			dao = new ClassCDao();
			break;
		}
		return dao;
	}
}
