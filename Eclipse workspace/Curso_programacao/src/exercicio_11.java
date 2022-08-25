import java.util.Locale;
import java.util.Scanner;

public class MianXI {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double base, altura;
		double area, perimetro, diagonal;
		
		System.out.println("Escreva as medidas da base e altura de um retângulo. Em seguida,\r\n" + 
				"mostrar o valor da área, perímetro e diagonal deste retângulo");
		System.out.print("Digite a medida da base:");
		base = sc.nextDouble();
		System.out.print("Digite a medida da altura:");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = 2.0 * (base + altura);
		diagonal = Math.sqrt(base * base + altura * altura);
		
		System.out.printf("AREA: %.3f%n", area);
		System.out.printf("PERIMETRO: %.3f%n", perimetro);
		System.out.printf("DIAGONAL: %.3f%n", diagonal);
	}

}
