package fr.eni.jse.demo.tests;

import fr.eni.jse.demo.data.Personne;

public class TestsRecord {

	public static void main(String[] args) {
		//démo 1 : tester le Record avec sa définition la plus simple.
		Personne tom = new Personne(1l, "Bluth", "Tom", "tom.bluth@mail.com", 22); 
		System.out.println(tom.id()); //1 
		System.out.println(tom.email()); //tom.bluth@mail.com 
		System.out.println(tom); //Personne[id=1, nom=Bluth, prenom=Tom, email=tom.bluth@mail.com, age=22]
		
		//démo 2 : ajout de constructeurs (Canonique puis compacte)
		Personne samuel = new Personne(2l, "Bluth", "Samuel", "samuel.bluth@mail.com", 20); 
		try {
			Personne felix = new Personne(3l, "Bluth", "Felix", "felix.bluth@mail.com", 17);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		} 
		
		//démo 3 : ajout de constructeurs (Personnalisé)
		Personne charline = new Personne(4l, "Bluth", "Charline"); 
		
		//démo 4 : appel des méthodes
		System.out.println(charline.isMineur());   //false
		System.out.println(charline.fullName());  //Bluth Charline


	}

}
