package fr.eni.annuaire.bo;

public class Professionnel extends Contact {
    private String nomEntreprise;
    

    //----------------Getters et Setters-------------//

    public String getNomEntreprise() {
		return nomEntreprise;
	}


	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}


    //----------Les constructeurs -----------//
    public Professionnel() {
		super();
	}


	public Professionnel(long numero, String nom, String telephone, String adresseMail, boolean favoris,
			Adresse adresse, String nomEntreprise) {
		super(numero, nom, telephone, adresseMail, favoris, adresse);
		this.nomEntreprise = nomEntreprise;
	}

    //------------Méthode to String-------------//
	
	
	@Override
	public String toString() {
		return "Professionnel [nomEntreprise=" + nomEntreprise + ", getNomEntreprise()=" + getNomEntreprise()
				+ ", getNature()=" + getNature() + "]";
	}
	
	
	
	//-------------redefinition de la méthode getNature----//
	@Override
	protected String getNature() {
		return this.getClass().getSimpleName();
	}


	
	
	
	
	
}
