package fr.eni.jse.demo.bo;

import java.time.LocalDate;

/**
 * La classe Alternant est une classe dérivée de la classe Stagiaire
 * Elle spécialise le classe Stagiaire
 * @author bmartin
 *
 */
//HERITAGE
//La classe dérivée spécialise (redéfinie, substitue) les comportements de type Stagiaire dans son contexte
public class Alternant extends Stagiaire {
	//Elle définie ses attributs spécifiques
	private LocalDate debutContrat;
	private String nomEntreprise;
	
	//Elle définie ses constructeurs en tenant compte de ceux proposés par sa classe de base
	/**
	 * 
	 */
	public Alternant() {
		super();
	}


	/**
	 * @param numero
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 */
	public Alternant(long numero, String nom, String prenom, LocalDate dateNaissance, LocalDate debutContrat, String nomEntreprise) {
		super(numero, nom, prenom, dateNaissance); //chainage de construsteur vers classe de base
		this.debutContrat = debutContrat;
		this.nomEntreprise = nomEntreprise;
	}

	//Elle définie ses propres accesseurs et comportements
	public LocalDate getDebutContrat() {
		return debutContrat;
	}


	public void setDebutContrat(LocalDate debutContrat) {
		this.debutContrat = debutContrat;
	}


	public String getNomEntreprise() {
		return nomEntreprise;
	}


	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}


	/**
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 */
	public Alternant(String nom, String prenom, LocalDate dateNaissance, LocalDate debutContrat, String nomEntreprise) {
		this(0, nom, prenom, dateNaissance, debutContrat, nomEntreprise); //chainage de constructeur local à la classe dérivée
	}


	//Elle redefinie (substitue) des comportements initiés par la classe de base
	@Override
	public String toString() {
		return String.format("%s [debutContrat=%s, nomEntreprise=%s] => %s ", getNature(), debutContrat, nomEntreprise, super.toString());
	}

	@Override
	protected String getNature() {
		return this.getClass().getSimpleName();
	}	
	
}
