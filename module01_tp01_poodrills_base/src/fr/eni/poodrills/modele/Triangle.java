package fr.eni.poodrills.modele;

public class Triangle extends Forme {
	//Attributs
	private float largeur;
	private float hauteur;
	
	
	//Constructeurs
	public Triangle(float largeur, float hauteur) {
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	
	//Méthodes
	public float calculerSurfaceTriange() {
		return largeur * hauteur / 2;
	}
	
	//Méthodes
		public float calculerSurface() {
			return calculerSurfaceTriange();
		}
	
	

	//Getters et Setters
	public float getLargeur() {
		return largeur;
	}
	
	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}
	
	public float getHauteur() {
		return hauteur;
	}
	
	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}

	@Override
	public String toString() {
		return "Triangle [largeur=" + largeur + ", hauteur=" + hauteur + "]";
	}


	
	
	
}
