package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		
		this.clan = clan;
	}
	
	public void extorquer(Commercant commercantVictime) {
		super.gagnerArgent(commercantVictime.getArgent());
		commercantVictime.seFaireExtorquer();
		super.parler("J'ai piqu� 45 sous de " + commercantVictime.getNom() + ", ce qui me fait " + super.getArgent() + " dans ma poche. Hi ! Hi !");
	}
}