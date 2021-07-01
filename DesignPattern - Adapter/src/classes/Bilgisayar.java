package classes;

import interfaces.ElektrikliEvAletleri;

public class Bilgisayar implements ElektrikliEvAletleri {
	
	private int volt;
	
	public Bilgisayar () {
		this.volt = 12;
	}

	@Override
	public int prizeTakveCalistir() {
		
		System.out.println("Bilgisayar �al���yor.");
		return volt;
	}

}
