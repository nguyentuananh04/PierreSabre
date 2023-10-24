package histoire;

import personnages.Humain;

public class Commercant extends Humain{
	private String boissonFavorite;
	
	public Commercant(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.boissonFavorite = "thé";
	}	
	
	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
		perderArgent(super.argent);
		return argent;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
}
