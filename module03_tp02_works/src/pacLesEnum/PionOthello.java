package pacLesEnum;

import pacLesInterfaces.I_Affichable;

public enum PionOthello implements I_Affichable {
	PION_VIDE('.'),
    PION_NOIR('⚈'),
    PION_BLANC('⚆');

    private char symbole;

    PionOthello(char symbole) {
        this.symbole = symbole;
    }

    //Méthode Override avant modification
//    @Override
//    public char getSymbole() {
//        return symbole;
//    }
    
   
    @Override
    public char getSymbole() {
        switch (this) {
            case PION_NOIR:
                return symbole; // Utilisation de la variable symbole de l'énumération
            case PION_BLANC:
                return symbole; // Utilisation de la variable symbole de l'énumération
            case PION_VIDE:
                return symbole; // Utilisation de la variable symbole de l'énumération
            default:
                return symbole; // Utilisation de la variable symbole de l'énumération
        }
    }
       
  
    
}
