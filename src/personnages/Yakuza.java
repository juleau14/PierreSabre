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
		int argentGagne = commercantVictime.seFaireExtorquer();
		super.gagnerArgent(argentGagne);
		super.parler("J'ai piqué " + argentGagne + " sous à " + commercantVictime.getNom() + ", ce qui me fait " + super.getArgent() + " dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argentPerdu;
		argentPerdu = super.getArgent();
		super.perdreArgent(argentPerdu);
		reputation -= 1;
		super.parler("J'ai perdu mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan des " + this.clan + ".");
		
		return argentPerdu;
	}
	
	public int gagner(int gain) {
		super.parler("Ce ronin pensait vraiment pouvoir batte " + super.getNom() + " du clan " + this.clan + " ? " + "Je l'ai dépouillé de ses " + gain + " sous !");
		super.gagnerArgent(gain);
		reputation += 1;
		
		return gain;
	}
}
