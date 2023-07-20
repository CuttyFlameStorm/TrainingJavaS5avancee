package pacLesEnum;

import pacLesInterfaces.I_Affichable;

public enum PionEchecs implements I_Affichable {
	
		TOUR_BLANC('♖'),
	    TOUR_NOIR('♜'),
	 	ROI_BLANC('♔'),
	    ROI_NOIR('♚'),
		REINE_BLANC('♕'),
	    REINE_NOIR('♛'),
		FOU_BLANC('♗'),
	    FOU_NOIR('♝'),
		CAVALIER_BLANC('♘'),
	    CAVALIER_NOIR('♞'),
		PION_BLANC('♙'),
	    PION_NOIR('♟'),
	    PION_VIDE(' ');

	    private char symbole;

	    PionEchecs(char symbole) {
	        this.symbole = symbole;
	    }

	    @Override
	    public char getSymbole() {
	        switch (this) {
	            case PION_NOIR:
	                return symbole; // Utilisation de la variable symbole de l'énumération
	            case PION_BLANC:
	                return symbole; // Utilisation de la variable symbole de l'énumération
	            case CAVALIER_NOIR:
	                return symbole; // Utilisation de la variable symbole de l'énumération
	            case CAVALIER_BLANC:
	            	return symbole; // Utilisation de la variable symbole de l'énumération
	            case FOU_NOIR:
	            	return symbole; // Utilisation de la variable symbole de l'énumération
	            case FOU_BLANC:
	            	return symbole; // Utilisation de la variable symbole de l'énumération
	            case REINE_BLANC:
	            	return symbole; // Utilisation de la variable symbole de l'énumération
	            case REINE_NOIR:
	            	return symbole; // Utilisation de la variable symbole de l'énumération
	            case ROI_BLANC:
	            	return symbole; // Utilisation de la variable symbole de l'énumération
	            case ROI_NOIR:
	            	return symbole; // Utilisation de la variable symbole de l'énumération
	            case TOUR_BLANC:
	            	return symbole; // Utilisation de la variable symbole de l'énumération
	            case TOUR_NOIR:
	            	return symbole; // Utilisation de la variable symbole de l'énumération
	            case PION_VIDE:
	            	return symbole; // Utilisation de la variable symbole de l'énumération
	            default:
	                return symbole; // Utilisation de la variable symbole de l'énumération
	        }
	    }
	
}
