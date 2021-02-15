package unidade4.escola;

public abstract class Funcionario { //clsses abstratas nao podem ser instanciadas.

	public static void main(String[] args) {

		Funcionario antonio = new Professor(); // Polimorfismo

		Funcionario andrea = new Administrativo(); // Polimorfismo

		Funcionario pedro = new Diretor(); // Polimorfismo

		pedro.verificarTipoFuncionario(pedro);

		antonio.verificarTipoFuncionario(antonio);

		pedro.verificarTipoFuncionario(andrea);
		
		//Interface recebendo referencia de um objeto que implementa a interface.
		
		/*
		Professor prof = new Professor();
		
		Autenticavel aut = prof;
		
		Cidadao cid = prof;
		
		Contribuinte cont = prof;
		*/
	}

	public abstract void getBonificacao();

	public void verificarTipoFuncionario(Funcionario funcionario) {

		if (funcionario instanceof Diretor) {

			System.out.println("Diretor");

		} else if (funcionario instanceof Professor) {

			System.out.println("Professor");

		} else {

			System.out.println("Administrativo");
		}
	}
}
