package fr.eni.annuaire.data;

import java.util.List;

import fr.eni.annuaire.bo.Utilisateur;

public record Utilisateurs(int id, String nom, String pseudo, String motPasse) {

	public Utilisateurs(List<Utilisateur> tempUsers) {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
