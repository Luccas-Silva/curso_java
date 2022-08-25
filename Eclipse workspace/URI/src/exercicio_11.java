import java.util.Locale;
import java.util.Scanner;

public class MainXI {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome;
		double s, v, ns;
		
		System.out.print("Digite o nome do vendeder: ");
		nome = sc.next();
		System.out.print("Digite o salário fixo: ");
		s = sc.nextDouble();
		System.out.print("Digite o total de vendas: ");
		v = sc.nextDouble();
		ns = s +(v * 15 / 100);
		System.out.println("Vendedor ganha-se 15% de comissão sobre suas vendas efetuadas");
		System.out.printf("O novo salario e de $%.2f %n", ns);

		sc.close();
	}

}
