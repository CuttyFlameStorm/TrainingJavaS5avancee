package fr.eni.jse.demo.bo;

public interface Volant {
	
	int NB_AILES = 2; //public static final

	void voler(); //public abstract 
	
	//A partir du JDK 8
	//les classes ont le choix d'implémenter ou non cette méthode
	//interessant pour l'évolutivité des interfaces sans impact direct sur les classes les implémentant
	default void monter() {
		System.out.println("Cet objet volant monte !");
		privateMethod();
	}
	
	default void descendre() {
		System.out.println("Cet objet volant monte !");
		privateMethod();
	}
	
	//A partir du JDK 9
	//possibilité de définir des méthodes privées
	//interessant pour la mutualisation du code des méthodes défault
	private void privateMethod() {
		System.out.println("Réalisation de privateMethod");
	}
	
	//A partir du JDK 9
	//possibilité de définir des méthodes statiques
	static void staticMethod() {
		System.out.println("Réalisation de staticMethod");
	}
}
