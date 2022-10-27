package histoire;
import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant Marco = new Commercant("Marco", 20);
		
		Marco.direBonjour();
		
		Marco.seFaireExtorquer();
		
		Marco.gagnerArgent(15);
		
		Marco.parler("15 sous, je te remercie généreux donateur !");
		
		Marco.boire();
	}
}
