import java.util.Scanner;

public class IX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, in, fin;
		char R;
		
		//in =  intervalo/ fin = Fora do intervalo/ R = repetir//
		
		in = 0;
		fin = 0;
		
		System.out.println("	Intervalo [10,20]");
		System.out.println("");
		
		do {
			System.out.print("  Digite um numero: ");
			N = sc.nextInt();
			
			if (N> 10 && N < 20) {
				in = in + 1;	
			}
			else {
				fin = fin + 1;
			}
			
			System.out.print("  Deseja repetir (s/n)? ");
			R = sc.next().charAt(0);
			
		} while (R != 'n');
		
		
		
		System.out.println("  No intervalo: "+in);
		System.out.println("  Fora do intervalo: "+fin);
		
		sc.close();

	}

}
