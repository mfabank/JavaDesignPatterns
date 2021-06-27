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
			System.out.println("Baþarlý bir þekilde giriþ yapýldý.");
			return true;
		}
		else {
			System.out.println("Kullanýcý adý ve þifrenizi kotrol ediniz.");
			login = false;
		}
		return false;
		
	}

	public boolean KotaAc(double kota) {
		
		login();
		
		if(!login) {
			System.out.println("Sisteme giriþ yapmanýz gerekmektedir.");
			return false;
		}
		
		kotas.KotaAc(kota);
		return true;
	}

}


