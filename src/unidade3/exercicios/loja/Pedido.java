package unidade3.exercicios.loja;

public class Pedido {
	
	private String nomeCliente;
	private String nomeProduto;
	private String dataEntrega;
	private String enderecoEntrega;
	
	public Pedido() {
		
	}

	public Pedido(String nomeCliente, String nomeProduto, String dataEntrega, String enderecoEntrega) {
		super();
		this.nomeCliente = nomeCliente;
		this.nomeProduto = nomeProduto;
		this.dataEntrega = dataEntrega;
		this.enderecoEntrega = enderecoEntrega;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	@Override
	public String toString() {
		return "Pedido [nomeCliente=" + nomeCliente + ", nomeProduto=" + nomeProduto + ", dataEntrega=" + dataEntrega
				+ ", enderecoEntrega=" + enderecoEntrega + "]";
	}

	
	
	
	
	
	
}
