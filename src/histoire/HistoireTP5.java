package histoire;

import personnage.Commercant;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {

		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);

		marco.direBonjour();
		roro.direBonjour();
		marco.faireConnaissanceAvec(roro);
		System.out.println("Le marchand Marco rencontre le yakuza.");
		marco.direBonjour();
		yaku.direBonjour();
		marco.faireConnaissanceAvec(yaku);
		System.out.println("Le marchand Marco rencontre un autre marchand.");
		marco.direBonjour();
		chonin.direBonjour();
		marco.faireConnaissanceAvec(chonin);
		System.out.println("Le marchand Marco rencontre un autre marchand.");
		marco.direBonjour();
		kumi.direBonjour();
		marco.faireConnaissanceAvec(kumi);
		marco.listerconnaissance();

	}
}
