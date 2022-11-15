package histoire;
import personnages.*;

public class HistoireTP5 {
	public static void main(String[] args) {
		 Commercant marco =  new Commercant("Marco", 20); 
		 Samourai akimoto = new Samourai("Akimoto", "Saké", 80, "Miyamoto");
		 
		 akimoto.faireConnaissance(marco);
		 marco.faireConnaissance(akimoto);
		 
		 akimoto.listerConnaissance();
		 akimoto.boire("thé");;
	}
}
