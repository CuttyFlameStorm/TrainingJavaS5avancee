package fr.eni.poodrills.modele;

public class Rectangle extends Forme {
    private float largeur;
    private float hauteur;

    public Rectangle(float largeur, float hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public float calculerSurface() {
        return largeur * hauteur;
    }
}

