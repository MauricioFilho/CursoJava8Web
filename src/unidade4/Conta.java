package unidade4;

public class Conta {

	// attributes
	private int numero;
	private double saldo;
	private double limite;
	private String nome;

	// Constructors

	public Conta() {

	}

	public Conta(int numero, double saldo, double limite, String nome) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	// Getters and Setters

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Methods

	public boolean saca(double valor) {

		double limiteSaque = this.limite + this.saldo;

		if (valor <= limiteSaque) {
			
			this.saldo -= valor;
			System.out.println("Saque autorizado\nValor: R$" + valor);
			return true;

		} else {

			System.out.println("Saque não autorizado!!\n" + "Motivo: Valor solicitado maior que o limite permitido: R$"
					+ limiteSaque);
			return false;
		}

	}

	public void deposita(double valor) {

		this.saldo += valor;

	}

	public void transfere(Conta destino, double valor) {

		if (valor <= this.saldo) {
			
			this.saldo -= valor;
			destino.setSaldo(valor);
			
			System.out.println("Transferencia concluida com sucesso!\n" 
					+ "Conta Destino:" + destino.getNumero()
					+ "\nValor transferido: R$" + valor);
		}else {
			
			System.out.println("Transferencia não concluida!\n" + 
					"Motivo: Saldo menor que o valor solicitado.");
		}
	
	}

	// Main Method

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		
		conta1.setNome("Mauricio Goulart");
		conta1.setLimite(200);
		conta1.setSaldo(50);
		conta1.setNumero(123);

		Conta conta2 = new Conta();
		
		conta2.setNome("Priscila Costa");
		conta2.setLimite(350);
		conta2.setSaldo(230);
		conta2.setNumero(321);
		
		System.out.println("Saldo conta 1: " + conta1.getSaldo());
		System.out.println("Saldo conta 2: " + conta2.getSaldo());

	}

}
