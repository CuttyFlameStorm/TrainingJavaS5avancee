package fr.eni.interfacedrills.modele;

import INTERFACE.IAnimal;
import INTERFACE.ISiffleur;

public class Humain implements IAnimal, ISiffleur {
	
	
	
	public void dormir() {
		System.out.println("l'Humain dort comme un humain");
		System.out.println("Zzzzz");
	}
	
	public void communiquer() {
		System.out.println("Bonjour");
	}
	
	@Override
	public void siffler() {
		System.out.println("Pfiouiou");
	}
	
	@Override
	public void manger() {
		System.out.println("Je mange comme un humain");
	}

	
	
	
}
