package pacLesEnum;

import pacLesInterfaces.I_Affichable;

public enum PionNavale implements I_Affichable {
	PION_VIDEJeuNaval('.'),
    PORTE_AVION('✈'),
    CUIRASSE('⛴'),
    CROISEUR('⛵'),
    DESTROYER('ⅅ'),
    SOUS_MARIN('℺');

    private char symbole;

    PionNavale(char symbole) {
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
            case PORTE_AVION:
                return symbole; // Utilisation de la variable symbole de l'énumération
            case CUIRASSE:
                return symbole; // Utilisation de la variable symbole de l'énumération
            case CROISEUR:
                return symbole; // Utilisation de la variable symbole de l'énumération
            case DESTROYER:
                return symbole; // Utilisation de la variable symbole de l'énumération
            case SOUS_MARIN:
                return symbole; // Utilisation de la variable symbole de l'énumération
            case PION_VIDEJeuNaval:
                return symbole; // Utilisation de la variable symbole de l'énumération
            default:
                return symbole; // Utilisation de la variable symbole de l'énumération
        }
    }
    
}
