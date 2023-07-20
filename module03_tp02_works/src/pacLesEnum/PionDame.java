package pacLesEnum;

import pacLesInterfaces.I_Affichable;

public enum PionDame implements I_Affichable {
    PION_NOIR('⭕'),
    PION_BLANC('⚈'),
    PION_VIDETabDame('.');
	

    private char symbole;

    PionDame(char symbole) {
        this.symbole = symbole;
    }

    //Méthode Override avant modification
//  @Override
//  public char getSymbole() {
//      return symbole;
//  }
    
    @Override
    public char getSymbole() {
        switch (this) {
            case PION_NOIR:
                return symbole; // Utilisation de la variable symbole de l'énumération
            case PION_BLANC:
                return symbole; // Utilisation de la variable symbole de l'énumération
            case PION_VIDETabDame:
                return symbole; // Utilisation de la variable symbole de l'énumération
            default:
                return symbole; // Utilisation de la variable symbole de l'énumération
        }
    }
    

    
}
