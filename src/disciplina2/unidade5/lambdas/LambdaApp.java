package disciplina2.unidade5.lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {

	int somatorio;

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4);
		int numero = 10;
		LambdaApp app = new LambdaApp();

		// Lambdas
		integers.forEach(x -> System.out.println(x));

		integers.forEach(x -> {

			x += 10;

			System.out.println(x);

		});

		integers.forEach(x -> {

			x += numero;

			System.out.println(x);

		});

		integers.forEach(x -> {

			x += numero;
			app.somatorio += x;

			System.out.println(x);

		});

		System.out.println(app.somatorio);

		integers.forEach(x -> {

			int y = x / 2;
			System.out.println(y);

			x += numero;
			System.out.println(x);

		});
		
		integers.forEach((Integer x) -> {

			int y = x / 2;
			System.out.println(y);

			x += numero;
			System.out.println(x);

		});

	}

}
