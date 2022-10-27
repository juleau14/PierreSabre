package personnages;

public class Ronin extends Humain {
	int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant commercantBeneficiaire) {
		double sommeADonner = super.getArgent() * 0.1;
		super.parler(commercantBeneficiaire.getNom() + " prenez ces " + (int)sommeADonner + " sous.");
		commercantBeneficiaire.gagnerArgent((int)sommeADonner);
		super.perdreArgent((int)sommeADonner);
		commercantBeneficiaire.parler((int)sommeADonner + " sous !, je te remercie généreux donateur");
	}
	
	public void provoquer(Yakuza yakuzaAdverse) {
		int force = honneur * 2;
		
		if (force >= yakuzaAdverse.getReputation()) {
			int gain = yakuzaAdverse.perdre();
			gagnerArgent(gain);
			honneur += 1;
			super.parler("J'ai gagné GG");
		}
		
		else {
			honneur -= 1;
			int perte = super.getArgent();
			super.perdreArgent(super.getArgent());
			
			super.parler("J'ai perdu ... :(");
			
			yakuzaAdverse.gagner(perte);
		}
	}
}
