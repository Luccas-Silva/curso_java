import java.util.Locale;
import java.util.Scanner;

public class mainXIV {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double x1, y1, x2, y2, Dis;
		
		System.out.println("Distância Entre Dois Pontos");
		System.out.print("Digite o 1° valor: ");
		x1 = sc.nextDouble();
		System.out.print("Digite o 2° valor: ");
		y1 = sc.nextDouble();
		System.out.print("Digite o 3° valor: ");
		x2 = sc.nextDouble();
		System.out.print("Digite o 4° valor: ");
		y2 = sc.nextDouble();
		
		Dis = Math.sqrt(Math.pow((x2-x1), 2.0) + Math.pow((y2-y1), 2.0));
		
		System.out.printf("A distância entre dois pontos é %.4f %n", Dis);
		
		sc.close();

	}

}
