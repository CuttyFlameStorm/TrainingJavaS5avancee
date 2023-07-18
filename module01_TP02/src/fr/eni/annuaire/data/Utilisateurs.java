package fr.eni.annuaire.data;

public record Utilisateurs(int id, String nom, String pseudo, String motPasse) {
	
	public fr.eni.annuaire.bo.Utilisateur toUtilisateur() {
        return new fr.eni.annuaire.bo.Utilisateur();
    }
	
}
