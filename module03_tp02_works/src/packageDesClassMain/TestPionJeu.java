package packageDesClassMain;

import pacLesEnum.PionDame;
import pacLesEnum.PionNavale;
import pacLesGeneriques.Plateau;
import pacLesPions.PionOthello;

public class TestPionJeu {

	public static void main(String[] args) {
		
		
		
		// test jeu Othello
		Plateau<PionOthello> plateauOthello = new Plateau<>(8, 8, new PionOthello(' '));
		plateauOthello.setTarget(3, 3, new PionOthello('⚈'));
		plateauOthello.setTarget(4, 4, new PionOthello('⚈'));
		plateauOthello.setTarget(3, 4, new PionOthello('⚆'));
		plateauOthello.setTarget(4, 3, new PionOthello('⚆'));
		
		System.out.println("Plateau Othello standard:");
		plateauOthello.afficherPlateauDuJeuChoisi();
		System.out.println();
		//----------------------------------------------------
		
		// test PionOthello avec enum PionNavale
		Plateau<pacLesEnum.PionOthello> plateauOthelloEnum = new Plateau<>(8, 8, pacLesEnum.PionOthello.PION_VIDE);	
		plateauOthelloEnum.setTarget(3, 3, pacLesEnum.PionOthello.PION_NOIR);
		plateauOthelloEnum.setTarget(4, 4, pacLesEnum.PionOthello.PION_NOIR);
		plateauOthelloEnum.setTarget(3, 4, pacLesEnum.PionOthello.PION_BLANC);
		plateauOthelloEnum.setTarget(4, 3, pacLesEnum.PionOthello.PION_BLANC);

        System.out.println("Plateau Othello Enum:");
        plateauOthelloEnum.afficherPlateauDuJeuChoisi();
        System.out.println();
        //----------------------------------------------------
		
		
		// test jeu Dames avec enum PionDame
		Plateau<PionDame> plateauDames = new Plateau<>(8, 8, PionDame.PION_VIDETabDame);
		plateauDames.setTarget(3, 3, PionDame.PION_NOIR);
		plateauDames.setTarget(4, 4, PionDame.PION_NOIR);
		plateauDames.setTarget(3, 4, PionDame.PION_BLANC);
		plateauDames.setTarget(4, 3, PionDame.PION_BLANC);

		System.out.println("Plateau plateauDames Enum:");
		plateauDames.afficherPlateauDuJeuChoisi();
        System.out.println();
        //----------------------------------------------------
		
		
		
		// test pion navale avec enum PionNavale
		Plateau<PionNavale> plateauNavale = new Plateau<>(10, 10, PionNavale.PION_VIDEJeuNaval);
		plateauNavale.setTarget(0, 0, PionNavale.CUIRASSE);
		plateauNavale.setTarget(1, 1, PionNavale.CROISEUR);
		plateauNavale.setTarget(2, 2, PionNavale.DESTROYER);

		System.out.println("Plateau plateauNavale Enum:");
		plateauNavale.afficherPlateauDuJeuChoisi();
        System.out.println();
        //----------------------------------------------------
		

		

	}

}
