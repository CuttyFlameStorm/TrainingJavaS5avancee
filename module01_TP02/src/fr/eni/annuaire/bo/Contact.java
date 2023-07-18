package fr.eni.annuaire.bo;

public abstract class Contact {
	
	protected abstract String getNature();
	
    private long numero;
    private String nom;
    private String telephone;
    private String adresseMail;
    private boolean favoris;
    private Adresse adresse;

    
    

    public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public boolean isFavoris() {
		return favoris;
	}

	public void setFavoris(boolean favoris) {
		this.favoris = favoris;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Contact() {
    	super();
    }
    


	public Contact(long numero, String nom, String telephone, String adresseMail, boolean favoris, Adresse adresse) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.telephone = telephone;
		this.adresseMail = adresseMail;
		this.favoris = favoris;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Contact [numero=" + numero + ", nom=" + nom + ", telephone=" + telephone + ", adresseMail="
				+ adresseMail + ", favoris=" + favoris + ", adresse=" + adresse + "]";
	}

    
  
}
