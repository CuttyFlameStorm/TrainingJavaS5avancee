package pacLesGeneriques;

import java.util.ArrayList;
import java.util.List;

import pacLesInterfaces.I_Affichable;

public class Plateau<T extends I_Affichable>  {
	//attributs --//
	private int largeurPlateau; // représente également le nombre de colonne.
	private int hauteurPlateau;
	private List<T> pions;
	private int positionPion; // position du pion dans le tableau monodimensionnel.
	
	//Constructors sans parametre --//
	public Plateau() {
		this.largeurPlateau = 0;
        this.hauteurPlateau = 0;
        this.pions = new ArrayList<>();
		
	}
	
	//-- getters et setters --[]--------------------------
	public int getLargeurPlateau() {
		return largeurPlateau;
	}

	public void setLargeurPlateau(int largeurPlateau) {
		this.largeurPlateau = largeurPlateau;
	}

	public int getHauteurPlateau() {
		return hauteurPlateau;
	}

	public void setHauteurPlateau(int hauteurPlateau) {
		this.hauteurPlateau = hauteurPlateau;
	}

	public List<T> getPions() {
		return pions;
	}

	public void setPions(List<T> pions) {
		this.pions = pions;
	}
	//---------------------------------------------------
	/*Methode ToString*/
	
	@Override
	public String toString() {
		return "Plateau [largeurPlateau=" + largeurPlateau + ", hauteurPlateau=" + hauteurPlateau + ", pions=" + pions
				+ "]";
	}

	
	//---------------* Constructor avec Parametres *----------------------------------//
	

	public Plateau(int largeurPlateau, int hauteurPlateau, T valeurDeLaCaseInitiale) {
		super();
		this.largeurPlateau = largeurPlateau;
		this.hauteurPlateau = hauteurPlateau;
        this.pions = new ArrayList<>(largeurPlateau * hauteurPlateau); // Taille initiale de la liste

     // Initialiser l'ensemble des cases du plateau avec la valeur initiale
        for (int i = 0; i < largeurPlateau * hauteurPlateau; i++) {
            pions.add(valeurDeLaCaseInitiale);
        }
	}


	//--* Méthode de la class générique *--
	
	// Méthodes pour accéder aux éléments du plateau ou getTarget/setTarget sera soit une case vide, soit une case pion.
    public T getTarget(int x, int y) { // Méthode pour accéder à un élément du plateau
        positionPion = y * largeurPlateau + x;
        return pions.get(positionPion);
    }

    public void setTarget(int x, int y, T target) {  // Méthode pour définir un élément sur le plateau
        positionPion = y * largeurPlateau + x;
        pions.set(positionPion, target);
    }
    
    
    
    public void afficherPlateauDuJeuChoisi() {  // Méthode pour afficher le plateau de jeu
        for (int y = 0; y < hauteurPlateau; y++) {
            for (int x = 0; x < largeurPlateau; x++) {
                T lePionDuJeu_ou_Vide = getTarget(x, y);
                System.out.print(lePionDuJeu_ou_Vide.getSymbole() + " ");
            }
            System.out.println();
        }
    }
	
   
	
	
	

}
