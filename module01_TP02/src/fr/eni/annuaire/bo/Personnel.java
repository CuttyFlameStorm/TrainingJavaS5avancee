package fr.eni.annuaire.bo;

import java.time.LocalDate;

public class Personnel {
    private LocalDate dateAnniversaire;

    public Personnel(LocalDate dateAnniversaire) {
        this.dateAnniversaire = dateAnniversaire;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - dateAnniversaire.getYear();
        if (currentDate.getMonthValue() < dateAnniversaire.getMonthValue()
                || (currentDate.getMonthValue() == dateAnniversaire.getMonthValue()
                && currentDate.getDayOfMonth() < dateAnniversaire.getDayOfMonth())) {
            age--;
        }
        return age;
    }

    public String getNature() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        return "Personnel [dateAnniversaire=" + dateAnniversaire + "]";
    }

	public LocalDate getDateAnniversaire() {
		return dateAnniversaire;
	}

	public void setDateAnniversaire(LocalDate dateAnniversaire) {
		this.dateAnniversaire = dateAnniversaire;
	}
}
