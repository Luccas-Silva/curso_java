import java.util.Scanner;

public class MainIII {


		public static void main(String[] args) {
				
			Scanner sc = new Scanner(System.in);
				
			int A, B, PROD;
				
			System.out.print("Digide um numero: ");
			A = sc.nextInt();
			System.out.print("Digide outro numero: ");
			B = sc.nextInt();    
	
		    PROD= A * B;
	    
		    System.out.println("PROD = " + PROD);
	    
		 sc.close();
	}

}
