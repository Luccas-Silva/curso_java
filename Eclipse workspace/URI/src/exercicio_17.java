import java.util.Locale;
import java.util.Scanner;

public class MainXVII {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int n, r, d, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12; 
		double d13, d14, d15, d16, d17, d18, d19;
		
		System.out.println("      Notas e Moedas");
		System.out.print("Digite o numeros em R$:");
		n = sc.nextInt();
		
		d = n / 100;
		r = n % 100;
		d1 = r / 50;
		d2 = r % 50;
		d3 = d2 / 20;
		d4 = d2 % 20;
		d5 = d4 / 10; 
		d6 = d4 % 10;
		d7 = d6 / 5;
		d8 = d6 % 5;
		d9 =  d8 / 2;
		d10 = d8 % 2;
		d11 = d10 / 1;
		d12 = d10 % 1;
		d13 = (int)(d12 / 0.50);
		d14 = (int)(d12 % 0.50);
		d15 = (int) (d14 / 0.25);
		d16 = (int) (d14 % 0.25);
		d17 = (int) (d16 / 0.10);
		d18 = (int) (d16 % 0.10);
		d19 = (int) (d18 / 0.5);
		
		System.out.println("    NOTAS:");
		System.out.println(d +" nota(s) de R$ 100.00");
		System.out.println(d1 +" nota(s) de R$ 50.00");  
		System.out.println(d3 +" nota(s) de R$ 20.00"); 
		System.out.println(d5 +" nota(s) de R$ 10.00");
		System.out.println(d7 +" nota(s) de R$ 5.00");
		System.out.println(d9 +" nota(s) de R$ 2.00");
		System.out.println(     "MOEDAS:");  
		System.out.println(d11 +" moeda(s) de R$ 1.00");
		System.out.println(d13 +" moeda(s) de R$ 0.50");
		System.out.println(d15 +" moeda(s) de R$ 0.25");
		System.out.println(d17 +" moeda(s) de R$ 0.10");
		System.out.println(d19 +" moeda(s) de R$ 0.05");
		
		
		sc.close();

	}

}
