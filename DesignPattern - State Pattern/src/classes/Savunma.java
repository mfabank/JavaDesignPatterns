package classes;

import interfaces.Konsol;

public class Savunma implements Konsol{

	@Override
	public void kareTusunaBas() {
		System.out.println("Rakibe müdahele ediliyor.");
		
	}

	@Override
	public void ucgenTusunaBas() {
		System.out.println("Kaleci kaleden çýkýyor");
		
	}

	@Override
	public void yuvarlakTusunaBas() {
		System.out.println("Rakibe kayarak müdahele ediliyor.");
		
	}

	@Override
	public void carpiTusunaBas() {
		System.out.println("Rakibe markaj yapýlýyor.");
		
	}

}


