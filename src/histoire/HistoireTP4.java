package histoire;

import personnage.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		
	Humain prof = new Humain("Prof"," kombucha" , 52);
	prof.direBonjour();
	prof.parler("J'ai 54 sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
	prof.acheter("kombucha", 12);
	prof.boire();
	prof.parler("J'ai 42 sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
	prof.acheter("jeu", 2);
	prof.acheter("kimono", 50);
	}
}
