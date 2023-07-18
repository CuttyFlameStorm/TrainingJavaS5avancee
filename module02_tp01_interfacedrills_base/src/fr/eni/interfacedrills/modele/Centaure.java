package fr.eni.interfacedrills.modele;

import INTERFACE.IAnimal;
import INTERFACE.ISiffleur;

public class Centaure extends Cheval implements IAnimal, ISiffleur {

	
	
	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		super.dormir();
	}

	@Override
	public void communiquer() {
		// TODO Auto-generated method stub
		super.communiquer();
	}

	@Override
	public void galoper() {
		// TODO Auto-generated method stub
		super.galoper();
	}

	@Override
	public void manger() {
		// TODO Auto-generated method stub
		super.manger();
	}
	
	public void siffler() {
		System.out.println("Je siffle comme un humain");
	}

	
	
}
