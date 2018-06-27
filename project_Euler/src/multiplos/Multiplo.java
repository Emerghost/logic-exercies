package multiplos;

public class Multiplo {

	public static void main(String[] args) {
		int total = 0;
		
		
		for (int i = 0; i != 1000; i++) {
			
			if(i % 5 == 0 || i % 3 == 0) {
				total = total + i;
			}		
			else {
				
			}
			
		}
		
		System.out.println(total);

	}

}
