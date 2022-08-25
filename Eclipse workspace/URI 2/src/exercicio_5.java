import java.util.Scanner;
public class V {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("digite um numero: ");
		x = sc.nextInt();
		
		while (x != 0) {
			
			// se for impar, mais alguns 1
			if (x %  2  !=  0 ) {
				x = x +  1 ;
			}
			
			// expressão simplificada: 5 * x + 20
			int soma = x + x +  2  + x +  4  + x +  6  + x +  8 ;
			System.out.println(soma);
			System.out.print("digite outro numero: ");
			x = sc . nextInt ();
		}
		
		sc.close();

	}

}
