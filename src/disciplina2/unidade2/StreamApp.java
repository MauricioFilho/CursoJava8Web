package disciplina2.unidade2;

import java.io.FileInputStream;

public class StreamApp {
	
	public static void byteStream() throws Exception{
		
		FileInputStream entrada = new FileInputStream("C:\\Users\\Desenvolvimento\\eclipse-workspace\\CursoJava8Web\\src\\disciplina2\\unidade2\\dados.txt");
		int contador = 0;
		
		while((entrada.read()) != -1) {
			contador++;
		
			System.out.println("Numero de caracteres e:" + contador);
		}
		
		
		entrada.close();
		
	}
	
	public static void caracterStream(char letra) throws Exception {
		
		FileInputStream entrada = new FileInputStream("C:\\Users\\Desenvolvimento\\eclipse-workspace\\CursoJava8Web\\src\\disciplina2\\unidade2\\dados.txt");
		int contador = 0;
		int c;
		while((c = entrada.read()) != -1) {
			
			if(c == letra)
			contador++;
		}
		System.out.println("Numero vezes que o caracter foi encontrado:" + contador);
		entrada.close();
		
	}
	
	public static void main(String[] args) {
		
		try {
			//byteStream();
			
			caracterStream('t');
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
