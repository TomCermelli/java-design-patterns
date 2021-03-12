package fr.diginamic.factory;

import java.util.Enumeration;

import fr.diginamic.entite.EnceinteConnecte;
import fr.diginamic.entite.ObjetConnect;
import fr.diginamic.entite.Tablette;
import fr.diginamic.entite.TelephonePortable;
import fr.diginamic.entite.TypeConnect;

public class ObjetConnectFactory {
	
	public static ObjetConnect getObjetConnect(TypeConnect type, int volt) {
		
		if (type.equals(TypeConnect.TELEPHONE) ) {

		return new TelephonePortable(volt);

		}
		else if (type.equals(TypeConnect.TABLETTE) ) {

		return new Tablette(volt);

		}
		else if(type.equals(TypeConnect.ENCEINTE)) {
			return new EnceinteConnecte(volt);
		}
		return null;
		}
	
	

}
