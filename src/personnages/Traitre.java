package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int traitrise = 0;

	public Traitre(String nom, String boissonFavorite, int argent, String seigneur) {
		super(nom, boissonFavorite, argent, seigneur);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de traitrise est de " + this.traitrise + ".");
	}
	
	public void ranconner(Commercant commercant) {
		double doubleRancon = commercant.getArgent() * 0.2;
		int rancon = (int)doubleRancon;
		
		super.gagnerArgent(rancon);
		commercant.perdreArgent(rancon);
		
		traitrise++;
	}
	
	
	public void faireLeGentil() {
		double doubleDon = super.getArgent() * 0.05;
		int don = (int)doubleDon;
		Random rand = new Random();
		int aleatoire = rand.nextInt(super.getNombreConnaissances());
	}

}
