package disciplina1.unidade4.sisalucar;

public class Carro extends Veiculo {

	private long idCarro;
	private String placa;
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	private float valorDiaria;
	private Revendedor revendedor;

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

	public long getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Revendedor getRevendedor() {
		return revendedor;
	}

	public void setRevendedor(Revendedor revendedor) {
		this.revendedor = revendedor;
	}

	public void abastecer(int quantidadeLitros) {
		
		System.out.println("");
	}

	public void fechaPorta() {
	}

	public void abrePorta() {
	}

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		// Metodos acessados por heran�a de ve�culo
		carro1.acelera();
		carro1.freia();
		carro1.getPassageiros();
		carro1.getVelocidade();

		// Atributos acessados da superclass (apenas se forem protected)
		carro1.autonomia = 0;
	}
}
