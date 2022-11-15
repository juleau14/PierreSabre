package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private Humain [] memoire = new Humain[30];
	private int nombreConnaissances = 0;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println(this.nom + " - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		perdreArgent(prix);
		parler("J'ai acheté le bien : " + bien + " au prix de " + prix + " pièces !");
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;	
	}
	
	private void memoriser(Humain autreHumain) {
		if (nombreConnaissances < memoire.length) {
			memoire[nombreConnaissances] = autreHumain;
			nombreConnaissances++;
		}
		
		else {
			for (int i = 0; i < memoire.length - 1; i++) {
				memoire[i] = memoire[i + 1];
			}
			memoire[memoire.length - 1] = autreHumain;
		}
	}
	
	
	public void listerConnaissance() {
		if (nombreConnaissances == 0) {
			parler("Je ne connais personne... :(");
		}
		
		else {
			String connaissances = "";
			
			for (int i = 0; i < nombreConnaissances; i++) {
				connaissances += memoire[i].getNom() + ", ";
			}
			parler("Je connais beaucoup de monde dont : " + connaissances);
		
		}
	}
	
	public void faireConnaissance(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
}
