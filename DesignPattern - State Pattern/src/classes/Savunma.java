package classes;

import interfaces.Konsol;

public class Savunma implements Konsol{

	@Override
	public void kareTusunaBas() {
		System.out.println("Rakibe m�dahele ediliyor.");
		
	}

	@Override
	public void ucgenTusunaBas() {
		System.out.println("Kaleci kaleden ��k�yor");
		
	}

	@Override
	public void yuvarlakTusunaBas() {
		System.out.println("Rakibe kayarak m�dahele ediliyor.");
		
	}

	@Override
	public void carpiTusunaBas() {
		System.out.println("Rakibe markaj yap�l�yor.");
		
	}

}


