package histoire;
import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain Prof = new Humain("Prof", "kombucha", 54);
		
		Prof.parler("J'ai " + Prof.getArgent() + " sous en poche, je vais pouvoir m'offir une boisson à 12 sous !");
		Prof.acheter("kombucha", 12);
		Prof.boire();
		
		Prof.parler("J'ai " + Prof.getArgent() + " sous en poche, je vais pouvoir m'offir un jeu à 2 sous !");
		Prof.acheter("jeu", 2);
		
		Prof.parler("Je n'ai que " + Prof.getArgent() + " sous en poche, je ne peux même pas m'offrir un kimono à 50 sous.");
	}
}
