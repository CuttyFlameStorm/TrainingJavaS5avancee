package fr.eni.poodrills.modele;
import java.util.Objects;

public class Personne {

	private int noPersonne;
	
	private String nom;

	
	
	
	public Personne(int noPersonne, String nom) {
		super();
		this.noPersonne = noPersonne;
		this.nom = nom;
	}




	@Override
	public String toString() {
		return "Personne [noPersonne=" + noPersonne + ", nom=" + nom + "]";
	}





	public int getNoPersonne() {
		return noPersonne;
	}




	public void setNoPersonne(int noPersonne) {
		this.noPersonne = noPersonne;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return noPersonne == personne.noPersonne &&
                Objects.equals(nom, personne.nom);
    }

    

    
}
	
	
	
	
	
	
	
	

