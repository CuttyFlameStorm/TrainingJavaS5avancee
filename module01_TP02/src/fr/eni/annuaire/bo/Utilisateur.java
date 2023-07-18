package fr.eni.annuaire.bo;

import fr.eni.annuaire.data.Utilisateurs;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
	

	private List<Utilisateurs> utilisateurs;

    public Utilisateur(int i, String string, String string2, String string3) {
        this.utilisateurs = new ArrayList<>();
    }

    public void ajouterUtilisateur(Utilisateurs utilisateur) {
        utilisateurs.add(utilisateur);
    }

    public void supprimerUtilisateur(Utilisateurs utilisateur) {
        utilisateurs.remove(utilisateur);
    }

    public List<Utilisateurs> getUtilisateurs() {
        return utilisateurs;
    }

    public String toString() {
        return "Utilisateur [utilisateurs=" + utilisateurs.toString() + "]";
    }
}
