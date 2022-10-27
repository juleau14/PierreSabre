package histoire;
import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Yakuza Yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Commercant Marco = new Commercant("Marco", 15);
		
		Yaku.direBonjour();
		Yaku.parler("Tiens tiens, ne serait-ce pas un faible marchant qui passe par là ?");
		Yaku.parler("Marco, si tu tiens à la vie, donne moi ta bourse !");
		Yaku.extorquer(Marco);
	}
}
