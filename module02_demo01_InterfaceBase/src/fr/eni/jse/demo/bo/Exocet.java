package fr.eni.jse.demo.bo;

//par l'implémentation des interfaces Volant et Nageant, l'exocet est obligé de redéfinir les méthodes nager et voler
public class Exocet implements Volant, Nageant{

	@Override
	public void nager() {
		System.out.println("Poisson volant qui nage");
	}

	@Override
	public void voler() {
		System.out.println("Poisson volant qui vole");
	}

	//redéfinition de la méthode default de l'interface Volant
	@Override
	public void monter() {
		//Volant.super.monter();
		System.out.println("Poisson volant qui monte");
	}
	
	

}
