package fr.eni.jse.demo.data;

public record Personne(Long id, String nom, String prenom, String email, int age) {
	//ajouter des constructeurs

//	/**
//	 * constructeur de définition (canonique)
//	 * @param id
//	 * @param nom
//	 * @param prenom
//	 * @param email
//	 * @param age
//	 */
//	public Personne(Long id, String nom, String prenom, String email, int age) {
//		this.id = id;
//		this.nom = nom;
//		this.prenom = prenom;
//		this.email = email;
//	    this.age = age;
//		if (age < 18) {
//			throw new IllegalArgumentException("La personne doit être majeure !");
//	    }
//	}
	
	//constructeur compacte (= la version précédente)
	public Personne {
		if (age < 18) {
		      //throw new IllegalArgumentException("La personne doit être majeure !");
			mineur = true;
		}
	}
	
	//surchage du constructeur
	public Personne(Long id, String nom, String prenom){
		this(id, nom, prenom, "nobody@domain.com", 18);
	    
	    //More code
	}
	
	//ajouter un champ et une méthode
	static boolean mineur;

	public boolean isMineur() {
		return mineur;
	}

	public String fullName() {
		return nom + " " + prenom;
	}

}
