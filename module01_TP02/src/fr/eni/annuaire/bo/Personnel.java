package fr.eni.annuaire.bo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Personnel extends Contact{
	
	private LocalDate dateAnniversaire;
	
	
	//---------------Getters et Setters--------------------//
	
	public LocalDate getDateAnniversaire() {
		return dateAnniversaire;
	}


	public void setDateAnniversaire(LocalDate dateAnniversaire) {
		this.dateAnniversaire = dateAnniversaire;
	}


	
	
	//-----------------Les Constructeurs----------------------------//
	public Personnel() {
		super();
	}


	public Personnel(long numero, String nom, String telephone, String adresseMail, boolean favoris, Adresse adresse, LocalDate dateAnniversaire) {
		super(numero, nom, telephone, adresseMail, favoris, adresse);
		this.dateAnniversaire = dateAnniversaire;
	}
	
	

	//-------------Methode de la class----------------------//
	public long getAge() {
		long diff = ChronoUnit.YEARS.between(this.dateAnniversaire, LocalDate.now());
		return diff;
	}
	
	
	//-------Méthode abstract de Contact ici redéfini -----//
	@Override
	protected String getNature() {
		return this.getClass().getSimpleName();
	}


	//----------Méthode to String --------------------//
	@Override
	public String toString() {
		return "Personnel [dateAnniversaire=" + dateAnniversaire + ", getAge()=" + getAge() + ", getNature()="
				+ getNature() + "]";
	}
	

	
  

    

    
}
