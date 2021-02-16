package disciplina1.unidade3.exercicios;

public class ExerciciosResumo {

	public static void main(String[] args) {

		// 1)
		String nome = "O Curso de Java";
		String avaliacao = " é otimo!";

		System.out.println(nome.concat(avaliacao));

		System.out.println(nome.substring(11, 15));

		/*
		 * 
		 */

		// 2)
		String[] result = divider("07/10/1989");

		for (String resultSplit : result) {

			System.out.println(resultSplit);
		}

		/*
		 * 
		 */
		
		
	}

	// 2)
	public static String[] divider(String word) {

		String[] result = word.split("/");

		return result;
	}
}
