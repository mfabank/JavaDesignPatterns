package classes;

import interfaces.Konsol;

public class Oyun {
	private Konsol konsol;
	
	public Oyun () {
		System.out.println("Oyun Ba�lad�.");
		konsol = new Hucum();
	}
	
	public void ucgen() {
		konsol.ucgenTusunaBas();
	}
	
	public void kare() {
		konsol.kareTusunaBas();
	}
	
	public void yuvarlak() {
		konsol.yuvarlakTusunaBas();
	}
	
	public void carpi() {
		konsol.carpiTusunaBas();
	}
	
	public void topuKazan() {
		System.out.println("Top kazan�ld�. H�cuma ��k�l�yor.");
		konsol = new Hucum();
	}
	
	public void topuKaybet() {
		System.out.println("Top kaybedildi. H�cuma ��k�l�yor.");
		konsol = new Savunma();
	}
}


