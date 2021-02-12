package unidade3.exercicios.loja;

import java.math.BigDecimal;

public class LojaApp {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente(1, "Mauricio", "Rua Silvestre Scotti, 522");
		Cliente cl2 = new Cliente(2, "Priscila", "Rua João Pessoa, 278");
		
		Produto p1 = new Produto(1, "Computador", new BigDecimal(1250.00));
		Produto p2 = new Produto(2, "Cafeteira", new BigDecimal(500.00));
		
		gerarPedidos(cl2, p2, "12/02/2021");
		
		/*
		Pedido pedido1 = new Pedido(cl1.getIdCliente(), p1.getIdProduto(), "12/02/2021", cl1.getEndereco());
		Pedido pedido2 = new Pedido(cl2.getIdCliente(), p2.getIdProduto(), "13/02/2021", cl2.getEndereco());
		
		System.out.println("Pedido 1: " + pedido1);
		System.out.println("Pedido 2: " + pedido2);
		*/
	}
	
	public static void gerarPedidos(Cliente cliente, Produto produto, String dataEntrega) {
		
		System.out.println(new Pedido(cliente.getNome(), produto.getDescricaoProduto(), dataEntrega, cliente.getEndereco())); 
		
	}

}
