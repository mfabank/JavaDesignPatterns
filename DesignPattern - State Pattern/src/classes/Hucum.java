package classes;

import interfaces.Konsol;

public class Hucum implements Konsol{

	@Override
	public void kareTusunaBas() {
		System.out.println("�ut ediliyor.");
		
	}

	@Override
	public void ucgenTusunaBas() {
		System.out.println("Ara pas� veriliyor.");
		
	}

	@Override
	public void yuvarlakTusunaBas() {
		System.out.println("Orta a��l�yor.");
		
	}

	@Override
	public void carpiTusunaBas() {
		System.out.println("K�sa pas veriliyor.");
		
	}

}


