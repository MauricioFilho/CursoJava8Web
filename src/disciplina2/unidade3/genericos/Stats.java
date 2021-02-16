package disciplina2.unidade3.genericos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Stats <T extends Number> {

	T[] num;

	public Stats(T[] num) {
		super();
		this.num = num;
	}
	
	double media() {
		
		int i = 0;
		double soma = 0;
		
		for (i = 0;i < num.length; i++) {
			
			soma += num[i].doubleValue();
			
		}
		
		return soma/i;
	}

}
