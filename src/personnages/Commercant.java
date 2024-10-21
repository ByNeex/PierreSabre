package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argentHumain) {
		super(nom, "thé", argentHumain);
	}
	/*
	 * 1ère solution (celle que j'ai utiliser pcq mieux écrite) :
	 * 	mettre le getteur en protected et l'utiliser.
	 * 
	 * 2ème solution :
	 * 	mettre l'attribut en protected mais le problème de cette méthode est que toute les classes filles
	 * 	peuvent accèder à l'attribut ce qui viol le principe d'encapsulation car difficile a contrôler les
	 * 	modifications des autres classes sur l'attribut dans la classe Humain.
	 * 
	 */
	
	public int seFaireExtorquer() {
		int argent = this.getArgentHumain();
		this.perdreArgent(argent);
		this.parler("J'ai tout perdu ! Le monde est vraiment trop injuste...");
		return argent;
		
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent + " sous ! Je te remercie généreux donateur !");
	}
	
	

}
