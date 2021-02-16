package disciplina1.unidade4.banco;

public class Conta {

	// attributes
	private int numero;
	protected double saldo;
	private double limite;
	private Cliente[] cliente; 

	// Constructors

	public Conta() {

	}

	public Conta(int numero, double saldo, double limite, Cliente[] cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.setCliente(cliente);
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
	
	public Cliente[] getCliente() {
		return cliente;
	}

	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
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
	
	public void atualiza(double taxa) {
		
		this.saldo += this.saldo * taxa;
		
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
	
	public void taxaPercentual() {
		
		
		
	}

	// Main Method

	public static void main(String[] args) {

		Conta conta = new Conta();
		
		conta.cliente = new Cliente[5]; //de 1 até 5 clientes
		
	
	}

	

}
