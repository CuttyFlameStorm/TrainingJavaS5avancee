package fr.eni.jse.demo.bo;

import java.time.LocalDate;

/**
 * La classe Continu est une classe dérivée de la classe Stagiaire
 * Elle spécialise le classe Stagiaire
 * @author bmartin
 *
 */
//HERITAGE
//La classe dérivée spécialise (redéfinie, substitue) les comportements de type Stagiaire dans son contexte
public class Continu extends Stagiaire {
	//Elle définie ses attributs spécifiques
	private ModesFinancement modeFinancement;	
	
	//Elle définie ses constructeurs en tenant compte de ceux proposés par sa classe de base
	/**
	 * 
	 */
	public Continu() {
		super();
	}


	/**
	 * 
	 * @param numero
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param modeFinancement
	 */
	public Continu(long numero, String nom, String prenom, LocalDate dateNaissance, ModesFinancement modeFinancement) {
		super(numero, nom, prenom, dateNaissance); //chainage de construsteur vers classe de base
		this.modeFinancement = modeFinancement;
	}


	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param modeFinancement
	 */
	public Continu(String nom, String prenom, LocalDate dateNaissance, ModesFinancement modeFinancement) {
		this(0, nom, prenom, dateNaissance, modeFinancement); //chainage de constructeur local à la classe dérivée
	}

	
	//Elle définie ses propres accesseurs et comportements
	public ModesFinancement getModeFinancement() {
		return modeFinancement;
	}


	public void setModeFinancement(ModesFinancement modeFinancement) {
		this.modeFinancement = modeFinancement;
	}


	
	//Elle redefinie (substitue) des comportements initiés par la classe de base
	@Override
	public String toString() {
		return String.format("%s [modeFinancement=%s] => %s ", getNature(), this.modeFinancement, super.toString());
	}


	@Override
	protected String getNature() {
		return this.getClass().getSimpleName();
	}

}
