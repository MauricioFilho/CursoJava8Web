package unidade3.sisalucar;

public class Carro {

	long idCarro;
	String placa;
	String fabricante;
	String modelo;
	String cor;
	int ano;
	float valorDiaria;
	Revendedor revendedor;
	
	public Carro() {

	}

	public Carro(long idCarro, String placa, String fabricante, String modelo, String cor, int ano, float valorDiaria,
			Revendedor revendedor) {
		super();
		this.idCarro = idCarro;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.valorDiaria = valorDiaria;
		this.revendedor = revendedor;
		
	}

	

	public static void main(String[] args) {

		//Carro carro1 = new Carro(1, "ABC-2001", "Volkswagem", "Gol", "Azul", 2013, 99.90f, Revendedor.EMANUELVEICULOS);

	}
}
