package fr.eni.annuaire.bo;

public class Adresse {

	private long code;
    private String rue;
    private String codePostal;
    private String ville;
    
    public Adresse(long code, String rue, String codePostal, String ville) {
        this.code = code;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
    
    public String toString() {
        return "Adresse [code=" + code + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
    }

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
