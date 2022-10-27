package histoire;
import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant Marco = new Commercant("Marco", 15);
		Ronin Roro = new Ronin("Roro", "shochu", 60);
		
		Roro.direBonjour();
		Roro.donner(Marco);
	}
}
