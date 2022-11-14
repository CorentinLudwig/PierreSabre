package personnage;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;


	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}



	public int getReputation() {
		return reputation;
	}



	public void extorquer(Commercant victime) {
		
		gagnerArgent(victime.seFaireExtorquer());
		reputation++;
		
	}
	
	public int perdre() {
		parler("J'ai perdu");
		reputation--;
		int money = getArgent();
		perdreArgent(money);
		return money;
	}
	
	public void gagner(int gain) {
		parler("J'ai gagner");
		reputation++;
		gagnerArgent(gain);
	}
	
	//@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}

}
