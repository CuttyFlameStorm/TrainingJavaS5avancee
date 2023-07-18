package fr.eni.jse.demo.bo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Promotion {
	//ASSOCIATION
	//attributs d'association 
	//une promotion est rattachée à une formation (Promotion -> Formation (1)) unidirectionnelle
	private Formation formation;
	//une promotion est attachée à des stagiaires (Promotion -> Stagiaires (0..*)) bidirectionnelle
	private List<Stagiaire> stagiaires;
	
	
	//attributs privés
	private String numero;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	
	//constructeur
	/**
	 * @param numero
	 * @param dateDebut
	 * @param dateFin
	 * @param formation : Une formation doit être assignée à chaque promotion
	 */
	public Promotion(String numero, LocalDate dateDebut, LocalDate dateFin, Formation formation) {
		super();
		this.numero = numero;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		//ASSOCIATION
		//réaliser l'association
		this.formation = formation;
		//préparer l'association
		this.stagiaires = new ArrayList<>(); //(cf comportement addStagiaire(Stagiaire newStag) en dessous)
	}

	
	//accesseurs
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	
	//ASSOCIATION
	//accesseur.s (en fonction des besoins) permettant de récupérer ou modifier la formation associée à la promotion
	public Formation getFormation() {
		return formation;
	}


	//comportement
	public int getDuree() {
		return (dateDebut != null && dateFin != null) ? Period.between(this.dateDebut, this.dateFin).getMonths() : 0;
	}
	
	//ASSOCIATION
	//La classe offre le.s comportement.s necessaire.s (en fonction des besoins) de gestion de l'association
	public void addStagiaire(Stagiaire newStag) {
		if (newStag != null) {
			stagiaires.add(newStag);
			//modifier l'etat du stagiaire 
			//(puisqu'il vient d'être ajouté à cette promo, il se doit de la référencer pour honorer l'association bidirectionnelle)
			newStag.setPromotion(this);
		}
	}
	public Iterator<Stagiaire> getStagiaires(){
		//retourner la liste (en lecture seule) des stagiaires affectés à cette promo
		return stagiaires.iterator();
	}
	public int getNbInscrits() {
		return stagiaires.size();
	}
	
	
	@Override
	public String toString() {
		String etat = String.format("Promotion [numero=%s, dateDebut=%s, dateFin=%s, durée=%d mois, nombre d'inscrits=%d]", numero, dateDebut, dateFin, getDuree(), getNbInscrits());
		//ASSOCIATION
		//s'appuyer sur l'association afin d'afficher les informations de la Formation liée à la Promotion
		if (formation != null) {
			etat = String.format("%s => %s",etat , formation.toString());
		}
		return etat;
	}

	
	

}
