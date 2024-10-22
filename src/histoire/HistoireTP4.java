package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {

		/*
		 * 1) Humain prof = new Humain("Prof", "kombucha", 54); prof.direBonjour();
		 * prof.acheter("une boisson", 12); prof.boire(); prof.acheter("un jeu", 2);
		 * prof.acheter("un kimono", 50);
		 */

		/* 
		 * 2.1)
		 * Commercant marco = new Commercant("Marco", 20); marco.direBonjour();
		 * marco.seFaireExtorquer(); marco.recevoir(15); marco.boire();
		 */

		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
//		yakuLeNoir.direBonjour();

		Ronin roro = new Ronin("Roro", "shochu", 54);
//		roro.direBonjour();
//		roro.donner(marco);
		
		roro.provoquer(yakuLeNoir);
		

	}

}
