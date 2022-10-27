package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argentAvantPerte = super.getArgent();
		super.perdreArgent(argentAvantPerte);
		super.parler("J'ai tout perdu et je m'apprête à partciper à Squid Game");
		
		return argentAvantPerte;
	}
}
