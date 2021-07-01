package classes;

import interfaces.ElektrikliEvAletleri;

public class Televizyon implements ElektrikliEvAletleri {
	
	private int volt;
	
	public Televizyon () {
		this.volt = 12;
	}

	@Override
	public int prizeTakveCalistir() {
		
		System.out.println("Televizyon çalýþýyor.");
		return volt;
	}

}
