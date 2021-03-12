package fr.diginamic.entite;

public class ObjetConnect {
	protected int limiteVolts;

	public ObjetConnect(int limiteVolts) {
		super();
		this.limiteVolts = limiteVolts;
	}

	public int getLimiteVolts() {
		return limiteVolts;
	}

	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

}
