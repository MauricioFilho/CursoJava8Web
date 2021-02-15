package unidade4.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {

	static int totalCarros = 0;

	public static void main(String[] args) {

		Cliente cl1 = new Cliente();

		cl1.setIdCliente(1);
		cl1.setCpf("12345678-90");
		cl1.setNome("Mauricio");
		cl1.setCnh("12345678");

		Carro car1 = new Carro();

		car1.setIdCarro(1);
		car1.setModelo("Gol");
		car1.setPlaca("JDK-0001");
		car1.setCor("Azul");
		car1.setAno(2013);
		car1.setValorDiaria(99.80f);
		car1.setFabricante("Volkswagem");

		totalCarros += 1;
		
		/*
		Cliente cl2 = new Cliente();
		Carro car2 = new Carro();
	*/
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(car1.getIdCarro(), cl1.getIdCliente(), car1.getValorDiaria(), 5);
		gerarRelatorioLocacao(car1, LocalDate.now(), LocalDate.now().plusDays(5));
	}

	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria, int diarias) {

		Locacao locacao = new Locacao();

		locacao.setIdCarro(idCarro);
		locacao.setIdCliente(idCliente);
		locacao.setIdLocacao(1);
		locacao.setDataInicio(LocalDate.now());
		locacao.setDataFim(LocalDate.now().plusDays(diarias));
		locacao.setValorLocado(valorDiaria * diarias);

	}

	public static void gerarRelatorioLocacao(Carro carro, LocalDate... datas) { // exemplo varArgs

		//float totalFaturado = carro.getValorDiaria();

	}
}
