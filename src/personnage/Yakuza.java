package personnage;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;


	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan, int reputation) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = reputation;
	}



	public void extorquer(Commercant victime) {
		gagnerArgent(victime.seFaireExtorquer());
		reputation++;
		
	}

}
