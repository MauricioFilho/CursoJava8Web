package disciplina2.unidade3.genericos;

public class UsoGenerico2 {

	public static void main(String[] args) {
		
		ExemploGenerics2<Integer, String> iob = new ExemploGenerics2<>(88, "Mauricio");
		
		System.out.println(iob.getObj2());
		System.out.println(iob.getObj1());
		
		iob.showType();
	}

}
