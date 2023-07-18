package fr.eni.jse.demo.bo;

public abstract class Mammifere {
	//Attributs
	private String nom;
	
	//Constructeur
	public Mammifere() {
		super();
	}
	
	public Mammifere(String nom){
		super();
		this.nom = nom;
	}
	
	
	//Méthode abstraites
	public abstract void communiquer();
	
	//Getters et setters
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
}
