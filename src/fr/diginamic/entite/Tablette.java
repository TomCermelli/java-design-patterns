package fr.diginamic.entite;

public class Tablette extends ObjetConnect{

	public Tablette(int limiteVolts) {
		super(limiteVolts);

	}

	@Override
	public String toString() {
		return "Tablette voltage:" +limiteVolts;
	}

	
}
