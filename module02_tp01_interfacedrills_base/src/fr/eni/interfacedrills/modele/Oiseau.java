package fr.eni.interfacedrills.modele;

import INTERFACE.IAnimal;
import INTERFACE.ISiffleur;

public class Oiseau implements IAnimal, ISiffleur {

	public void siffler () {
		System.out.println("Triliiiliiiiouuu");
	}

	
	public void manger() {
		System.out.println("Je mange comme un Cheval et un Humain");
		
	}

	
	public void communiquer() {
		System.out.println("Je communique en Chantant");
		
	}

	public void dormir() {
		System.out.println("Je dort aussi");
		
	}
}
