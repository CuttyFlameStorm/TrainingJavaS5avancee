package fr.eni.annuaire.bo;

public class Utilisateur {
    private int id;
    private String username;
    private String password;
    private String displayName;

    public Utilisateur(int id, String username, String password, String displayName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.displayName = displayName;
    }

    // Getters et setters (à définir selon vos besoins)

    @Override
    public String toString() {
        return "Utilisateur [id=" + id + ", username=" + username + ", password=" + password + ", displayName=" + displayName + "]";
    }
}
