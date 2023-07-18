package Application;

import java.time.LocalDate;

import fr.eni.annuaire.bo.Adresse;
import fr.eni.annuaire.bo.Contact;
import fr.eni.annuaire.bo.Personnel;
import fr.eni.annuaire.bo.Professionnel;
import fr.eni.annuaire.bo.Utilisateur;
import fr.eni.annuaire.data.Contacts;
import fr.eni.annuaire.data.Utilisateurs;

public class App1 {

	public static void main(String[] args) {
        // Création d'adresses
        Adresse adresse1 = new Adresse(1234, "Rue des Fleurs", "75000", "Paris");
        Adresse adresse2 = new Adresse(5678, "Avenue des Champs-Élysées", "75008", "Paris");
        Adresse adresse3 = new Adresse(91011, "Rue du Commerce", "69002", "Lyon");

        // Création d'utilisateurs
        Utilisateur utilisateur = new Utilisateur();
        Utilisateurs utilisateurs1 = new Utilisateurs(1, "John Doe", "johndoe", "password");
        Utilisateurs utilisateurs2 = new Utilisateurs(2, "Alice Smith", "alicesmith", "pass123");
        Utilisateurs utilisateurs3 = new Utilisateurs(3, "Bob Johnson", "bobjohnson", "hello123");

        utilisateur.ajouterUtilisateur(utilisateurs1);
        utilisateur.ajouterUtilisateur(utilisateurs2);
        utilisateur.ajouterUtilisateur(utilisateurs3);

        // Création de dates d'anniversaire
        LocalDate dateAnniversaire1 = LocalDate.of(1990, 5, 15);
        LocalDate dateAnniversaire2 = LocalDate.of(1985, 9, 25);
        LocalDate dateAnniversaire3 = LocalDate.of(1992, 3, 10);

        // Création de personnes
        Personnel personnel1 = new Personnel(dateAnniversaire1);
        Personnel personnel2 = new Personnel(dateAnniversaire2);
        Personnel personnel3 = new Personnel(dateAnniversaire3);

        // Création d'entreprises
        Professionnel professionnel1 = new Professionnel(1, "TestMail Corp", "0123456789", "contact@TestMail.com", adresse1, "TestMail Corp");
        Professionnel professionnel2 = new Professionnel(2, "Eni Company", "9876543210", "info@Eni.com", adresse2, "Eni Company");

        // Création de contacts
        Contact contact = new Contact();
        Contacts contacts1 = new Contacts(1, "John Smith", "0123456789", "john.smith@example.com", true, adresse1, personnel1, professionnel1);
        Contacts contacts2 = new Contacts(2, "Alice Johnson", "9876543210", "alice.johnson@example.com", false, adresse2, personnel2, professionnel2);
        Contacts contacts3 = new Contacts(3, "Bob Williams", "5555555555", "bob.williams@example.com", true, adresse3, personnel3, professionnel1);

        contact.ajouterContact(contacts1);
        contact.ajouterContact(contacts2);
        contact.ajouterContact(contacts3);

        // Affichage des utilisateurs
        System.out.println("Liste des utilisateurs :");
        for (Utilisateurs utilisateurs : utilisateur.getUtilisateurs()) {
            System.out.println(utilisateurs.toString());
        }

        // Affichage des contacts
        System.out.println("\nListe des contacts :");
        for (Contacts contacts : contact.getContacts()) {
            System.out.println(contacts.toString());
        }
    }

}
