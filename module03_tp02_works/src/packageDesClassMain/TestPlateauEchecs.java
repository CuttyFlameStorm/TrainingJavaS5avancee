package packageDesClassMain;

import pacLesEnum.PionEchecs;
import pacLesGeneriques.Plateau;

public class TestPlateauEchecs {

    public static void main(String[] args) {
        Plateau<PionEchecs> plateauEchecs = new Plateau<>(8, 8, PionEchecs.PION_VIDE);
        
        // Disposition des pièces pour le côté blanc
        plateauEchecs.setTarget(0, 0, PionEchecs.TOUR_BLANC);
        plateauEchecs.setTarget(1, 0, PionEchecs.CAVALIER_BLANC);
        plateauEchecs.setTarget(2, 0, PionEchecs.FOU_BLANC);
        plateauEchecs.setTarget(3, 0, PionEchecs.REINE_BLANC);
        plateauEchecs.setTarget(4, 0, PionEchecs.ROI_BLANC);
        plateauEchecs.setTarget(5, 0, PionEchecs.FOU_BLANC);
        plateauEchecs.setTarget(6, 0, PionEchecs.CAVALIER_BLANC);
        plateauEchecs.setTarget(7, 0, PionEchecs.TOUR_BLANC);
        
        for (int i = 0; i < 8; i++) {
            plateauEchecs.setTarget(i, 1, PionEchecs.PION_BLANC);
        }
        
        // Disposition des pièces pour le côté noir
        plateauEchecs.setTarget(0, 7, PionEchecs.TOUR_NOIR);
        plateauEchecs.setTarget(1, 7, PionEchecs.CAVALIER_NOIR);
        plateauEchecs.setTarget(2, 7, PionEchecs.FOU_NOIR);
        plateauEchecs.setTarget(3, 7, PionEchecs.REINE_NOIR);
        plateauEchecs.setTarget(4, 7, PionEchecs.ROI_NOIR);
        plateauEchecs.setTarget(5, 7, PionEchecs.FOU_NOIR);
        plateauEchecs.setTarget(6, 7, PionEchecs.CAVALIER_NOIR);
        plateauEchecs.setTarget(7, 7, PionEchecs.TOUR_NOIR);
        
        for (int i = 0; i < 8; i++) {
            plateauEchecs.setTarget(i, 6, PionEchecs.PION_NOIR);
        }
        
        plateauEchecs.afficherPlateauDuJeuChoisi();
    }
}
