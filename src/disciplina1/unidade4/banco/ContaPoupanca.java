package disciplina1.unidade4.banco;

public class ContaPoupanca extends Conta {
	
public void atualiza(double taxa) {
		
		super.saldo += super.saldo * (taxa *3);
		
	}
}
