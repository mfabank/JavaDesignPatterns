package classes;

import interfaces.IKota;

public class Kota implements IKota{

	
	public boolean KotaAc(double kota) {
		if(kota < 1000) {
			System.out.println("Tarafýnýza açýlacak kota minimum 1000 GB olmalýdýr. Eklemeniz gereken boyut : " + (1000 - kota) + " GB  ");
		}
		else if (kota > 1000) {
			System.out.println("Tarafýnýza açýlacak kota minimum 1000 GB olmalýdýr. Eksiltmeniz gereken boyut : " + (kota - 1000) + " GB  ");
		}
		else {
			System.out.println("Kota baþarýlý ile tanýmlandý. Kotanýz : " + kota + " GB");
			return true;
		}
		
		return false;
	}
	
}



