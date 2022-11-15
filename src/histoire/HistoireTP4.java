package histoire;
import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("yaku", "coca", 30, "teamyaku");
		Ronin Roro = new Ronin("Roro", "shochu", 60);
		
		Roro.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		Roro.provoquer(yaku);
	}
}
