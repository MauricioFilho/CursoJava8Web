package disciplina2.unidade2.streamIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerAppv2 {

	public static void main(String[] args) {

		try {

			Scanner entrada = new Scanner(new FileReader(
					"C:\\Users\\Desenvolvimento\\eclipse-workspace\\CursoJava8Web\\src\\disciplina2\\unidade2\\numeros.txt"));
			double soma = 0;
			String valor;
			
			while(entrada.hasNext()) {
				
				valor = entrada.next();
				soma = soma + Double.parseDouble(valor);
				
			}
			
			entrada.close();
			JOptionPane.showMessageDialog(null, "A Soma dos valores e:" + soma);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		

	}

}
