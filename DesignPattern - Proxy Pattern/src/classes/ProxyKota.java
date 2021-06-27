package classes;

import interfaces.IKota;

public class ProxyKota implements IKota{
	
	Kota kotas;
	boolean login;
	String kullaniciAdi, parola;
	
	public ProxyKota(String kullaniciAdi, String parola) {
		this.kullaniciAdi = kullaniciAdi;
		this.parola = parola;
	}
	
	boolean login() {
		if(kullaniciAdi.equals("admin") && parola.equals("admin")) {
			kotas = new Kota();
			login = true;
			System.out.println("Ba�arl� bir �ekilde giri� yap�ld�.");
			return true;
		}
		else {
			System.out.println("Kullan�c� ad� ve �ifrenizi kotrol ediniz.");
			login = false;
		}
		return false;
		
	}

	public boolean KotaAc(double kota) {
		
		login();
		
		if(!login) {
			System.out.println("Sisteme giri� yapman�z gerekmektedir.");
			return false;
		}
		
		kotas.KotaAc(kota);
		return true;
	}

}


