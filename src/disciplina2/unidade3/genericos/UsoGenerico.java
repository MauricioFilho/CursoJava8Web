package disciplina2.unidade3.genericos;

public class UsoGenerico {

	public static void main(String[] args) {
		
		ExemploGenerics<Integer> iob = new ExemploGenerics<>(88);
		iob.showType();
		
		ExemploGenerics<String> sob = new ExemploGenerics<>("Mauricio");
		sob.showType();
	}

}
