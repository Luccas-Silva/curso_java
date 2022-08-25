import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double X, Y;
		
		System.out.println("		* Exercício 07 *");
		System.out.println("");
		
		System.out.print(" Digite um valores com uma casa decimal para X : ");
		X = sc.nextDouble();
		System.out.print(" Digite um valores com uma casa decimal para Y : ");
		Y = sc.nextDouble();
		
		if (X > 0.0 && Y > 0.0) {
			System.out.println(" O ponto esta no * Q1 *");
		}
		else if (X < 0.0 && Y > 0.0) {
			System.out.println(" O ponto esta no * Q2 *");
		}
		else if (X < 0.0 && Y < 0.0) {
			System.out.println(" O ponto esta no * Q3 *");
		}
		else if (X > 0.0 && Y < 0.0) {
			System.out.println(" O ponto esta no * Q4 *");
		}
		else if (X == 0.0 && (Y > 0.0 || Y < 0.0)) {
			System.out.println(" O ponto esta no * Eixo Y *");
		}
		else if (Y == 0.0 && (X > 0.0 || X < 0.0)) {
			System.out.println(" O ponto esta no * Eixo X *");
		}
		else {
			System.out.println(" O ponto esta no * Origem *");
		}
		System.out.println("	      |Y");
		System.out.println("	 Q2   |   Q1");
		System.out.println("	      |    ");
		System.out.println("	______!______X");
		System.out.println("	      |");
		System.out.println("	 Q3   |   Q4");
		System.out.println("	      |");
		
		sc.close();

	}

}
