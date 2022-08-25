import java.util.Scanner;

public class MainXVI {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int I, A, M, M1, D, R;
		
		System.out.println("    Idade em Dias");
		System.out.print("Digite a quantidade de dias: ");
		I = sc.nextInt();
		A = I / 365;
		R = I % 365;
		M = R / 30;
		M1 = R % 30;
		D = M1 / 1;
		System.out.println(A + " ano(s)");
		System.out.println(M + " mes(es)");
		System.out.println(D + " dia(s)");
		
		sc.close();
	}

}
