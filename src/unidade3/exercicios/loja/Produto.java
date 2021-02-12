package unidade3.exercicios.loja;

import java.math.BigDecimal;

public class Produto {
	
	private long idProduto;
	private String descricaoProduto;
	private BigDecimal valorProduto;
	
	public Produto() {
		
		
	}

	public Produto(long idProduto, String descricaoProduto, BigDecimal valorProduto) {
		super();
		this.idProduto = idProduto;
		this.descricaoProduto = descricaoProduto;
		this.valorProduto = valorProduto;
	}

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", descricaoProduto=" + descricaoProduto + ", valorProduto="
				+ valorProduto + "]";
	}
	
	
}
