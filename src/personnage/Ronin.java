package personnage;

public class Ronin extends Humain {
	private int honneur = 1;
	

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		// TODO Auto-generated constructor stub
	}
	
	public void donner(Commercant beneficiaire) {
		int dons = getArgent()/10;
		beneficiaire.gagnerArgent(dons);
		parler(beneficiaire.getNom()+ "prend ces" +dons + "sous");
		perdreArgent(dons);
	}

}
