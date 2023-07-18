/**
 * 
 */
package fr.eni.jse.demo.bo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bmartin
 *
 */
public class Vehicule implements Cloneable{

	private int nbPlaces;
	
	//attributs de liaison
	private Personne conducteur;
	private List<Personne> passagers;


	/**
	 * @param nbPlaces
	 */
	public Vehicule(int nbPlaces) {
		super();
		this.nbPlaces = nbPlaces;
		passagers = new ArrayList<>(nbPlaces-1);
	}

	/**
	 * @param conducteur the conducteur to set
	 */
	public void setConducteur(Personne conducteur) {
		this.conducteur = conducteur;
	}
	
	public void addPassager(Personne passager) {
		if (passagers.size() < nbPlaces) {
			passagers.add(passager);
		}
	}
	
	public Personne getPassager(int place) {
		return passagers.get(place);
	}

	@Override
	public String toString() {
		return String.format("Vehicule *%s* [nbPlaces=%s, conducteur = %s, passagers = %s]", this.hashCode(), nbPlaces, conducteur.toString(),passagers.toString());
	}
	
	//Code source de la méthode Clone de la classe Object
	/*
	protected Object clone() throws CloneNotSupportedException{
		if (this instanceof Cloneable)
			return VMObject.clone((Cloneable) this);
		throw new CloneNotSupportedException("Object not cloneable");
	}
	*/
	
	@Override
	public Vehicule clone() throws CloneNotSupportedException {
		Vehicule clone = (Vehicule) super.clone();
		//cloner le conducteur
		clone.conducteur = this.conducteur.clone();
		//dupliquer le tableau
		clone.passagers = new ArrayList<>(this.passagers.size());
		//cloner chaque passager du tableau
		for (Personne personne : passagers) {
			clone.passagers.add(personne.clone());
		}		
		return clone;
	}
	
	
	
	

}
