package fr.eni.annuaire.bo;

import fr.eni.annuaire.data.Contacts;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private List<Contacts> contacts;

    public Contact() {
        this.contacts = new ArrayList<>();
    }

    public void ajouterContact(Contacts contact) {
        contacts.add(contact);
    }

    public void supprimerContact(Contacts contact) {
        contacts.remove(contact);
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public String toString() {
        return "Contact [contacts=" + contacts.toString() + "]";
    }
}
