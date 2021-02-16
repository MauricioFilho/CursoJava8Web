package disciplina1.unidade3.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {

	static int totalCarros = 0;

	public static void main(String[] args) {

		Cliente cl1 = new Cliente();

		cl1.idCliente = 1;
		cl1.cpf = "12345678-90";
		cl1.nome = "Mauricio";
		cl1.cnh = "12345678";

		Carro car1 = new Carro();

		car1.idCarro = 1;
		car1.modelo = "Gol";
		car1.placa = "JDK-0001";
		car1.cor = "Azul";
		car1.ano = 2013;
		car1.valorDiaria = 99.80f;
		car1.fabricante = "Volkswagem";

		totalCarros += 1;
		/*
		Cliente cl2 = new Cliente();
		Carro car2 = new Carro();
		*/
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(car1.idCarro, cl1.idCliente, car1.valorDiaria);
		gerarRelatorioLocacao(car1, LocalDate.now(), LocalDate.now().plusDays(5));
	}

	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {

		Locacao locacao = new Locacao();

		locacao.idCarro = idCarro;
		locacao.idCliente = idCliente;
		locacao.idLocacao = 1;
		locacao.dataInicio = LocalDate.now();
		locacao.dataFim = LocalDate.now().plusDays(2);
		locacao.valorLocado = 2 * valorDiaria;

	}

	public static void gerarRelatorioLocacao(Carro carro, LocalDate... datas) { // exemplo varArgs

		//float totalFaturado = carro.valorDiaria;

	}
}
