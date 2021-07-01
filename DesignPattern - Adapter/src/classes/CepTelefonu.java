package classes;

import interfaces.KucukAkim;

public class CepTelefonu implements KucukAkim{

	
	private int cepTelefonuGerekliAkim;
	
	public CepTelefonu () {
		cepTelefonuGerekliAkim = 5;
	}
	@Override
	public int sarjEt() {
		System.out.println("Cep telefonu çalýþýyor.");
		return cepTelefonuGerekliAkim;
	}

}
