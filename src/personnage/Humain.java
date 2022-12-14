package personnage;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private int nbConnaissance = 0;
	private Humain[] memoire = new Humain[30];

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	private String prendreParole() {
		return nom + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "? " + texte + "?");
	}

	public void direBonjour() {
		parler("Bonjour ! Je m?appelle " + nom + " et j?aime boire du " + boissonFavorite);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + "! GLOUPS !");
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m?me pas m'offrir un " + bien + " ? "
					+ prix + "sous.");
		}

	}

	public void faireConnaissanceAvec(Humain humain) {
		
		int memoirmax = 30;
		
		
		if (nbConnaissance < memoirmax) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		} else {
			for(int i=0;i>memoirmax;i++) {
				memoire[i]=memoire[i+1];
			}
			
			memoire[memoirmax-1]=humain;

		}
	}
	
	public void listerconnaissance() {
		parler("Je connais beaucoup de monde dont :");
		for(int i=0;i<nbConnaissance;i++) {
			System.out.println(memoire[i].getNom());
		}
	}
}
