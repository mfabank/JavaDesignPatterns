package classes;

import interfaces.IKota;

public class Kota implements IKota{

	
	public boolean KotaAc(double kota) {
		if(kota < 1000) {
			System.out.println("Taraf�n�za a��lacak kota minimum 1000 GB olmal�d�r. Eklemeniz gereken boyut : " + (1000 - kota) + " GB  ");
		}
		else if (kota > 1000) {
			System.out.println("Taraf�n�za a��lacak kota minimum 1000 GB olmal�d�r. Eksiltmeniz gereken boyut : " + (kota - 1000) + " GB  ");
		}
		else {
			System.out.println("Kota ba�ar�l� ile tan�mland�. Kotan�z : " + kota + " GB");
			return true;
		}
		
		return false;
	}
	
}



