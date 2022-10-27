package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
	}
	
	public int seFaireExtorquer() {
		int argentAvantPerte = super.getArgent();
		super.perdreArgent(argentAvantPerte);
		super.parler("J'ai tout perdu et je m'appr�te � partciper � Squid Game");
		
		return argentAvantPerte;
	}
}
