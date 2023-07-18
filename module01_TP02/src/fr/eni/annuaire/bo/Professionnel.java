package fr.eni.annuaire.bo;

public class Professionnel {
    private String nomEntreprise;
    private long numero;
    private String nom;
    private String telephone;
    private String adresseMail;
    private Adresse adresse;

    public Professionnel(long numero, String nom, String telephone, String adresseMail, Adresse adresse, String nomEntreprise) {
        this.numero = numero;
        this.nom = nom;
        this.telephone = telephone;
        this.adresseMail = adresseMail;
        this.adresse = adresse;
        this.nomEntreprise = nomEntreprise;
    }

    public String getNature() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        return "Professionnel [nomEntreprise=" + nomEntreprise + ", numero=" + numero + ", nom=" + nom + ", telephone=" + telephone + ", adresseMail=" + adresseMail + ", adresse=" + adresse.toString() + "]";
    }

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

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

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}
