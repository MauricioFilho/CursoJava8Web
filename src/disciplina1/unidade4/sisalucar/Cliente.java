package disciplina1.unidade4.sisalucar;

public class Cliente {

	private long idCliente;
	private String cpf;
	private String cnh;
	private String nome;

	public Cliente() {

	}

	public Cliente(long idCliente, String cpf, String cnh, String nome) {
		super();
		this.idCliente = idCliente;
		this.cpf = cpf;
		this.cnh = cnh;
		this.nome = nome;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cpf=" + cpf + ", cnh=" + cnh + ", nome=" + nome + "]";
	}
	
	
}
