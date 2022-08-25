import java.util.Scanner;

public class MainX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		double z;
		double x;
		double c;
		double area;
		double preco;
		
		System.out.print("Digide a largura: ");
		z = sc.nextDouble();
		System.out.print("Digide o comprimento: ");
		x = sc.nextDouble();
		System.out.print("Digide o valor do metro quadrado: ");
		c = sc.nextDouble();
		
		area = (double) z * x;
		preco = (double) c * area;
		
		System.out.printf("O valor da area e igual a %.2f %n",area);
		System.out.printf("O valor do tereno e igual a %.2f %n",preco);
		
		sc.close();
	}

}
