package fr.diginamic.entite;

public class EnceinteConnecte extends ObjetConnect {

	public EnceinteConnecte(int limiteVolts) {
		super(limiteVolts);

	}

	@Override
	public String toString() {
		return "Enceinte voltage:" +limiteVolts;
	}
	
	
}
