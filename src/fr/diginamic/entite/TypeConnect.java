package fr.diginamic.entite;

public enum TypeConnect {
	
	TELEPHONE("Telephone"),
	TABLETTE("Tablette"),
	ENCEINTE("Enceinte");
	
	private String nom;
	
	private TypeConnect(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
