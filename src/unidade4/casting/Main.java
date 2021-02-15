package unidade4.casting;

import unidade4.casting.Main.Beagle;

public class Main {

	interface Pet {
	}

	class Dog implements Pet {

	}

	class Beagle extends Dog {

		Pet pet1 = new Dog();
		//Pet pet2 = new Pet(); // interface não pode ser instanciada por ela mesma.
		Pet pet3 = new Beagle(); // interface pode ser instanciada por uma classe.

		//Dog dog1 = new Pet(); // interface não pode instanciar uma classe.
		Dog dog2 = new Beagle();

		Beagle c = (Beagle) new Dog(); // classe filha não pode instanciar uma classe pai, apenas com casting.

	}

	public static void main(String[] args) {

		// atruição normal
		char a = 'a';
		int b = 'b';
		int f = (a + 5);
		float c = 100;

		// casting

		int d = (int) 5.1987;
		float e = (float) 5.0;
		char g = (byte) 110.5;

	}

}
