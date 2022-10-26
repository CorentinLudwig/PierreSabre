package personnage;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
		// TODO Auto-generated constructor stub
	}

	public int seFaireExtorquer() {
		int money = getArgent();
		perdreArgent(money);
		super.parler("J’ai tout perdu! Le monde est trop injuste");
		return money;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		super.parler(argent+" sous ! Je te remercie généreux donateur!");
	}

	
}
