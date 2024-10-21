package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argentHumain; // diffère selon l'Humain

	public Humain(String nom, String boissonFavorite, int argentHumain) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argentHumain = argentHumain;
	}

	public String getNom() {
		return nom;
	}

	public int getArgentHumain() {
		return argentHumain;
	}

	private void parler(String texte) {
		System.out.println('(' + nom + ") - " + texte);
	}

	private void gagnerArgent(int gain) {
		argentHumain += gain;
	}

	private void perdreArgent(int perte) {
		argentHumain -= perte;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argentHumain >= prix) {
			parler("J'ai " + argentHumain + " sous en poche. " + "Je vais pouvoir m'offrir " + bien + " à " + prix
					+ " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argentHumain + " sous en poche. " + "Je ne peux même pas m'offrir " + bien
					+ " à " + prix + " sous.");
		}
	}

}
