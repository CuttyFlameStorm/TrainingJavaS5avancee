package fr.eni.interfacedrills.modele;

import INTERFACE.IAnimal;

public class Cheval implements IAnimal {

	public void dormir() {
		System.out.println("le cheval dort comme un cheval");
		System.out.println("Zzzzz");
	}
	
	public void communiquer() {
		System.out.println("Hiiiihihihiiii");
	}
	
	public void galoper() {
		System.out.println("Cataclop, cataclop");
	}
	
	@Override
	public void manger() {
		System.out.println("je mange comme un cheval");
	}
}
