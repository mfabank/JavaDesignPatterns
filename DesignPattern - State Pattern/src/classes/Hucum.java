package classes;

import interfaces.Konsol;

public class Hucum implements Konsol{

	@Override
	public void kareTusunaBas() {
		System.out.println("Þut ediliyor.");
		
	}

	@Override
	public void ucgenTusunaBas() {
		System.out.println("Ara pasý veriliyor.");
		
	}

	@Override
	public void yuvarlakTusunaBas() {
		System.out.println("Orta açýlýyor.");
		
	}

	@Override
	public void carpiTusunaBas() {
		System.out.println("Kýsa pas veriliyor.");
		
	}

}


