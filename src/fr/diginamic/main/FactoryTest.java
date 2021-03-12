package fr.diginamic.main;

import fr.diginamic.entite.ObjetConnect;
import fr.diginamic.entite.TypeConnect;
import fr.diginamic.factory.ObjetConnectFactory;

public class FactoryTest {

	public static void main(String[] args) {
		
		ObjetConnect objet1 = ObjetConnectFactory.getObjetConnect(TypeConnect.TELEPHONE, 15);
		ObjetConnect objet2 = ObjetConnectFactory.getObjetConnect(TypeConnect.TABLETTE, 40);
		ObjetConnect objet3 = ObjetConnectFactory.getObjetConnect(TypeConnect.ENCEINTE, 75);
		
		System.out.println(objet1);
		System.out.println(objet2);
		System.out.println(objet3);
		

	}

}
