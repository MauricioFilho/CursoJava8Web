package unidade4.escola;

public class Funcionario {

	public static void main(String[] args) {

		Funcionario jose = new Funcionario(); // Instanciação normal

		Funcionario antonio = new Professor(); // Polimorfismo

		Funcionario andrea = new Administrativo(); // Polimorfismo

		Funcionario pedro = new Diretor(); // Polimorfismo

		pedro.verificarTipoFuncionario(pedro);

		antonio.verificarTipoFuncionario(antonio);

		pedro.verificarTipoFuncionario(andrea);

	}

	public void verificarTipoFuncionario(Funcionario funcionario) {

		if (funcionario instanceof Diretor)  {

			System.out.println("Diretor");

		} else if (funcionario instanceof Professor) {

			System.out.println("Professor");

		} else {

			System.out.println("Administrativo");
		}
	}
}
