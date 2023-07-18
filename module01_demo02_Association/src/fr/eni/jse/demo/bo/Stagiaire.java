/**
 * 
 */
package fr.eni.jse.demo.bo;

import java.time.LocalDate;
import java.time.Period;

/**
 * Exemple de POJO
 * Notez que la classe n'effectue aucun code métier
 * @author bmartin
 *
 */
public class Stagiaire {
	//ASSOCIATION
	//attributs d'association 
	//un stagiaire peut être attaché à une promotion (Stagiaire -> Promotion (0..1)) bidirectionnelle
	private Promotion promotion;
	
	//attributs privés
	private long id;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	
	//constructeur par defaut
	/**
	 * construit une instance non valorisée
	 */
	public Stagiaire() {
		super();
	}
	
	//surcharge de constructeur (en fonction des besoins)
	/**
	 * Construit une instance non numérotée
	 * @param nom
	 * @param telephone
	 * @param adresseMail
	 */
	public Stagiaire(String nom, String prenom, LocalDate dateNaissance) {
		this(0, nom, prenom, dateNaissance); //chainage de constructeur
	}
	
	/**
	 * Construit une instance numerotée
	 * @param numero
	 * @param nom
	 * @param telephone
	 * @param adresseMail
	 */
	public Stagiaire(long numero, String nom, String prenom, LocalDate dateNaissance) {
		super();
		this.id = numero;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	//accesseurs publics
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	//ASSOCIATION 
	//accesseur.s (en fonction des besoins) permettant de récupérer ou modifier la promotion associée au stagiaire
	//(ici setter de niveau package pour respecter la règle liée à l'association)
	void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	
	//des comportements publics (en fonction des besoins)
	public int getAge() {
		int age = (dateNaissance != null ? Period.between(this.dateNaissance, LocalDate.now()).getYears() : 0);
		return age;
	}
	
	
	//redéfinitions (substitutions) de méthodes
	@Override
	public String toString() {
		String etat =  String.format("Stagiaire [id=%s, nom=%s, prenom=%s, dateNaissance=%s (age : %d an.s)]", id, nom, prenom, dateNaissance, getAge());
		//ASSOCIATION
		//s'appuyer sur l'association afin d'afficher les informations de la Promotion liée au Stagiaire
		if (promotion != null) {
			etat = String.format("%s => %s",etat , promotion.toString());
		}
		return etat;
	}

	/**
	 * tester l'égalité à partir des valeurs des attributs nom, prenom, dateNaissance
	 */
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		// Objet null ?
        if(obj == null) {
        	result = false ;
        	}
        // Même référence ?
        else if (this == obj) { //comparaison sur le hashcode
			result = true;
			}
        // Pas même référence mais Même classe et mêmes données ?
		else if (obj instanceof Stagiaire stagiaire && 
				(stagiaire.nom != null ? stagiaire.nom.equals(this.nom): false) &&
				(stagiaire.prenom != null ? stagiaire.prenom.equals(this.prenom) : false) &&
				(stagiaire.dateNaissance != null ? stagiaire.dateNaissance.equals(this.dateNaissance): false)) {
			result = true;
			}
		else result = false;
		return result;
	}

	
	/**
	 * calculer le hashcode à partir des valeurs des attributs nom, prenom, dateNaissance
	 */
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//	    int result = Objects.hash(nom);
//	    result = prime * result + Objects.hash(prenom);
//	    result = prime * result + Objects.hash(dateNaissance);
//	    return result;
//	}
	
}
