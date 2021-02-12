package unidade3.exercicios;

public class IdentifyMyParts {
	
	public static int x = 7;
	public int y = 3;
	
	public static void main(String[] args) {
		
		
		int r = 0;
		int s = -1;
		
		for(int c = 1; c <= 10; c++) {
			
			if(c % 2 == 0) {
				
				r = r + c * s;
			} else {
				
				r = r + c;
			}
		}
		
		System.out.println(r);
		
		IdentifyMyParts a = new IdentifyMyParts();
		IdentifyMyParts b = new IdentifyMyParts();
		
		a.y = 5;
		b.y = 6;
		a.x = 1;
		b.x = 2;
		
		System.out.println("a.y = " + a.y);
		System.out.println("b.y = " + b.y);
		System.out.println("a.x = " + a.x);
		System.out.println("b.x = " + b.x);
		
	
		
	}
}
