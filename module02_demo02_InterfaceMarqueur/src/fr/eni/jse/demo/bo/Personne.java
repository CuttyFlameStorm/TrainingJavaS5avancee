/**
 * 
 */
package fr.eni.jse.demo.bo;

/**
 * @author bmartin
 *
 */
public class Personne implements Cloneable {

	String nom;

	/**
	 * @param nom
	 */
	public Personne(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return String.format("Personne *%s* [nom=%s]", this.hashCode(), nom);
	}

	@Override
	public Personne clone() throws CloneNotSupportedException {
		return (Personne) super.clone();
	}
	
	

}
