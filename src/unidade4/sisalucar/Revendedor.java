package unidade4.sisalucar;

public enum Revendedor {

	ABCVEICULOS("101010/0001", "Rua das Perdizes, 1500", "Volkswagen"),
	SIMAOVEICULOS("010101/0001", "Av. Morumbi, 2500", "Honda"),
	EMANUELVEICULOS("111111/0001", "Av. das Na��es, 100", "Toyota");

	private String cnpj;
	private String endereco;
	private String fabricante;

	private Revendedor(String cnpj, String endereco, String fabricante) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.fabricante = fabricante;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
