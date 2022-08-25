import java.util.Locale;
import java.util.Scanner;

public class MainIX {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 		
		Locale.setDefault(Locale.US);
		
		int H, K;
		double L;
		
		System.out.println("Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem,");
		System.out.println("ao utilizar um automóvel que faz 12 KM/L.");
		
		System.out.print("O tempo gasto na viagem (em horas):");
		H = sc.nextInt();
		
		System.out.print("A velocidade média durante a mesma (em km/h):");
		K = sc.nextInt();
		
		L = (H * K) /12.0;
		System.out.printf("Litros necessária para realizar a viagem: %.3f %n" ,L);
		
		sc.close();
	}

}
