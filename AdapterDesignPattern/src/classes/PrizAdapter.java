package classes;

import interfaces.ElektrikliEvAletleri;

public class PrizAdapter implements ElektrikliEvAletleri{
	
	private CepTelefonu cepTelefonu;
	
	PrizAdapter(CepTelefonu cepTelefonu) {
		this.cepTelefonu = cepTelefonu;
	}

	@Override
	public int prizeTakveCalistir() {
		
		return cepTelefonu.sarjEt();
	}

}
