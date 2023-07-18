package fr.eni.jse.demo.bo;

public class Formation {
	private String code;
	private String libelle;
	/**
	 * @param code
	 * @param libelle
	 */
	public Formation(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return String.format("Formation [code=%s, libelle=%s]", code, libelle);
	}

}
