package fr.eni.jse.demo.bll;

import fr.eni.jse.demo.dal.ClassBDao;
import fr.eni.jse.demo.dal.ClassCDao;
import fr.eni.jse.demo.dal.DaoBuilder;
import fr.eni.jse.demo.dal.DaoInterface;
import fr.eni.jse.demo.data.Personne;

public class ClassAManager {
//	//REALISATION PAR COUPLAGE FORT
//	//*****************************
//	//couplage fort entre la classManager et la classDao utilisée
//	private ClassBDao dao;
//	//le changement de classDao génère une maintenance au sein de la classManager
//	private ClassCDao dao;
//	
//	public ClassAManager() {
//		//Couplage fort : point de maintenance 1 
//		//dao = new ClassBDao();
//		dao = new ClassCDao();
//	}
//	
//	public void persister(Personne personne) {
//		//Couplage fort : point de maintenance 2
//		//dao.save(personne);
//		dao.sauvegarder(personne);	
//	}
	
	//REALISATION PAR COUPLAGE FAIBLE
	//*******************************
	//couplage faible (étape 2) : la classManager s'appuie sur le type DaoInterface afin de référencer la classDao utilisée
	private DaoInterface dao;
	
	public ClassAManager() {
		//encore un axe d'amélioration..... (cf etape 3)
		//dao = new ClassBDao();
		//dao = new ClassCDao();
		
		//couplage faible (étape 3) : la classManager s'appuie la fabrique d'instances classDao.
		//le changement de classeDao n'affecte plus du tout la classManager (cf config.properties)
		dao = DaoBuilder.createInstance();
	}
	
	public void persister(Personne personne) {
		//Couplage faible : peu importe l'instance de ClassDao utilisée le manager sait qu'il peut invoquer la méthode sauvegarder()
		dao.sauvegarder(personne);
		
	}
}
