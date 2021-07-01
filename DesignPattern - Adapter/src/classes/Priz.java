package classes;

import interfaces.ElektrikliEvAletleri;

public class Priz {

	 public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri) {
		
		int volt = elektrikliEvAletleri.prizeTakveCalistir();
		
		System.out.println("Prizden " + volt + " volt alýnýyor.");
	}
	
}
