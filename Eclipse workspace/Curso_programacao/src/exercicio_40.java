import java.util.Scanner;

public class XL {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N;
		String [] nomes;
		
		System.out.print("Digite o numero de repetições: ");
		N = sc.nextInt();
		
		nomes = new String [N];
		
		System.out.println("");
		for (int I=0; I<N; I++) {
			System.out.print("Digite um nome: ");
			nomes[I] = sc.next();
		}
		
		System.out.println("");
		System.out.println("Nomes digitados:");
		System.out.println("");
		
		for (int I=0; I<N; I++) {
			System.out.println(nomes[I]);
			
		}
		
		
		sc.close();
	}

}
