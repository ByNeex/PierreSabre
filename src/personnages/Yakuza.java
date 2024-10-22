package personnages;

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
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() +  " , si tu tiens à la vie donne moi ta bourse !");
		int argentPrise = victime.seFaireExtorquer();
		
		this.gagnerArgent(argentPrise);
		this.parler("J’ai piqué les " + argentPrise + " sous de " + victime.getNom() + 
				", ce qui me fait " + this.getArgentHumain() + " sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argentYakuza = this.getArgentHumain();
		this.perdreArgent(argentYakuza);
		this.reputation--;
		this.parler("J'ai perdu mon duel et mes " + argentYakuza + " sous, snif... J'ai déshonoré le clan de " + this.clan + ".");
		
		return this.getReputation();
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + this.clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}

	
	

}
