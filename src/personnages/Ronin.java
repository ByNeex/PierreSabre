package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	private int force = 2 * honneur;

	public Ronin(String nom, String boissonFavorite, int argentHumain) {
		super(nom, boissonFavorite, argentHumain);
	}

	public void donner(Commercant benificiaire) {
		int don = (int) (this.getArgentHumain() * 0.1);
		this.parler(benificiaire.getNom() + " prend ces " + don + " sous.");
		this.perdreArgent(don);
		benificiaire.recevoir(don);
	}

	public void provoquer(Yakuza adversaire) {
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fais à ce pauvre marchand !");

		if (this.force >= adversaire.getReputation()) {
			this.parler("Je t'ai eu petit yakuza !");
			adversaire.perdre();
		} else {
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			this.honneur--;
			int argent = this.getArgentHumain();
			adversaire.gagner(argent);
			this.perdreArgent(argent);
			
		}
	}
}
