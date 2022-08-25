import java.util.Scanner;

public class MainXV {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n, r, s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11;
		
		System.out.println("      Cedulas");
		System.out.print("Digite um volaor em R$: ");
		n = sc.nextInt();
		
		s = n / 100;
		r = n % 100;
		s1 = r / 50;
		s2 = r % 50;
		s3 = s2 / 20;
		s4 = s2 % 20;
		s5 = s4 / 10;
		s6 = s4 % 10;
		s7 = s6 / 5;
		s8 = s6 % 5; 
		s9 = s8 / 2;
		s10 = s8 % 2;
		s11 = s10 / 1;
	
		System.out.println(s + " Nota(s) de R$ 100,00");
		System.out.println(s1 + " Nota(s) de R$ 50,00");
		System.out.println(s3 + " Nota(s) de R$ 20,00");
		System.out.println(s5 + " Nota(s) de R$ 10,00");
		System.out.println(s7 + " Nota(s) de R$ 5,00");
		System.out.println(s9 + " Nota(s) de R$ 2,00");
		System.out.println(s11 + " Nota(s) de R$ 1,00");
		
		sc.close();

	}

}
