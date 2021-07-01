package classes;

public class Test {

	public static void main(String[] args) {

		Priz priz = new Priz();
		
		Bilgisayar bilgisayar = new Bilgisayar();
		
		Televizyon televizyon = new Televizyon();
		
		priz.elektrikVer(bilgisayar);
		
		priz.elektrikVer(televizyon);
		
		CepTelefonu cepTelefonu = new CepTelefonu();
		
		PrizAdapter prizAdapter = new PrizAdapter(cepTelefonu);
		
		priz.elektrikVer(prizAdapter);
		
		

	}

}
