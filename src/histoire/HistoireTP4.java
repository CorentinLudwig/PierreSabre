package histoire;

import personnage.Commercant;
import personnage.Ronin;


public class HistoireTP4 {
	public static void main(String[] args) {
		
//	Humain prof = new Humain("Prof"," kombucha" , 52);
//	prof.direBonjour();
//	prof.parler("J'ai 54 sous en poche. Je vais pouvoir m'offrir une boisson � 12 sous");
//	prof.acheter("kombucha", 12);
//	prof.boire();
//	prof.parler("J'ai 42 sous en poche. Je vais pouvoir m'offrir un jeu � 2 sous");
//	prof.acheter("jeu", 2);
//	prof.acheter("kimono", 50);
//		
	Commercant marco = new Commercant("Marco", 20);
	marco.direBonjour();
//	marco.seFaireExtorquer();
//	marco.recevoir(15);
//	marco.boire();
	Ronin roro = new Ronin("Roro", "shoshu", 60);
	
	roro.donner(marco);
	
	
	}
}
