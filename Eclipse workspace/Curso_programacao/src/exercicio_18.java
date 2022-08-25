import java.util.Locale;
import java.util.Scanner;
public class MainXVIII {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		int min;
		double con;
		
		con = 50.0;
		
		System.out.println("------------------------");
		System.out.println(" Operadora de telefonia");
		System.out.println("------------------------");
		System.out.println("Plano de 100/min por R$50.00 ");
		System.out.println("Tacha de 2.00 por min amais ");
		
		System.out.print("minutos gastos:");
		min = sc.nextInt();
		
		if (min > 100) {
			con += (min - 100) * 2.0;
		}
		
		System.out.printf("Valor da Conta = R$ %.2f %n", con);
		
		sc.close();
		
	}

}
