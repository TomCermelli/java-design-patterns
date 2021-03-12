package fr.diginamic.entite;

public class TelephonePortable extends ObjetConnect {

	public TelephonePortable(int limiteVolts) {
		super(limiteVolts);

	}

	@Override
	public String toString() {
		return "Telephone Portable, voltage:" +limiteVolts;
	}
	
}
