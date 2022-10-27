package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant commercantVictime) {
		int argentGagne;
		argentGagne = commercantVictime.seFaireExtorquer();
		super.gagnerArgent(argentGagne);
		super.parler("J'ai piqué " + argentGagne + " sous à " + commercantVictime.getNom() + ", ce qui me fait " + super.getArgent() + " dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argentPerdu;
		argentPerdu = super.getArgent();
		super.perdreArgent(super.getArgent());
		reputation -= 1;
		super.parler("J'ai perdu...");
		
		return argentPerdu;
	}
	
	public int gagner(int gain) {
		super.gagnerArgent(gain);
		reputation += 1;
		super.parler("J'ai gagné je suis le meilleur !");
		
		return gain;
	}
}
