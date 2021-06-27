import java.util.Scanner;

import classes.ProxyKota;
import interfaces.IKota;

public class Program {

	public static void main(String[] args) {
		String kullaniciAdi = "";
		String parola = "";
		double gelenKota = 0;
		Scanner veriAl = new Scanner(System.in);
		
		while (true) {
			System.out.println("Kullanýcý Adý ");
			kullaniciAdi = veriAl.nextLine();
			veriAl.nextLine();
			
			System.out.println("Parola ");
			parola = veriAl.nextLine();
			
			
			System.out.println("Açýlacak Kota ");
			gelenKota = veriAl.nextDouble();
			
			IKota kota = new ProxyKota(kullaniciAdi, parola);
			kota.KotaAc(gelenKota);
		}

	}

}


