package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argentHumain) {
		super(nom, boissonFavorite, argentHumain);
	}
	
	public void donner(Commercant benificiaire) {
		int don = (int) (this.getArgentHumain() * 0.1);
		this.parler(benificiaire.getNom() + " prend ces " + don + " sous.");
		this.perdreArgent(don);
		benificiaire.recevoir(don);
	}

}
