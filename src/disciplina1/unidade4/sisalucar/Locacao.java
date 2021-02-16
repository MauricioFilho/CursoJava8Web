package disciplina1.unidade4.sisalucar;

import java.time.LocalDate;

public class Locacao {

	private long idLocacao;
	private long idCliente;
	private long idCarro;
	private float valorLocado;
	private LocalDate dataInicio;
	private LocalDate dataFim;

	public Locacao() {

	}

	public Locacao(long idLocacao, long idCliente, long idCarro, float valorLocado, LocalDate dataInicio,
			LocalDate dataFim) {
		super();
		this.idLocacao = idLocacao;
		this.idCliente = idCliente;
		this.idCarro = idCarro;
		this.valorLocado = valorLocado;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public long getIdLocacao() {
		return idLocacao;
	}

	public void setIdLocacao(long idLocacao) {
		this.idLocacao = idLocacao;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}

	public float getValorLocado() {
		return valorLocado;
	}

	public void setValorLocado(float valorLocado) {
		this.valorLocado = valorLocado;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public String toString() {
		return "Locacao [idLocacao=" + idLocacao + ", idCliente=" + idCliente + ", idCarro=" + idCarro
				+ ", valorLocado=" + valorLocado + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
	}
	
	
}
