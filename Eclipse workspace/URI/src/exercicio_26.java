import java.util.Locale;
import java.util.Scanner;

public class XXVI {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double X, Y;
		
		System.out.println("");
		System.out.println("    Coordenadas de um Ponto");
		System.out.println("");
		System.out.print(" Digite as coordenadas com uma casa decimal (X). Pode der (.) : ");
		X = sc.nextDouble();
		System.out.print(" Digite as coordenadas com uma casa decimal (Y). Pode der (.) : ");
		Y = sc.nextDouble();
		System.out.println("");
		
		if (X >= 0.1 && Y >= 0.1) {
			System.out.println(" Resposta: Q1");
		}
		else {
			if (X <= (-1) && Y >= 0.1) {
				System.out.println(" Resposta: Q2");
			}
			else {
				if (X <= (-1) && Y <= (-1)) {
					System.out.println(" Resposta: Q3");
				}
				else {
					if (X >= 0.1 && Y <= (-1)) {
						System.out.println(" Resposta: Q4");
					}
					else {
						System.out.println(" Resposta: Origem ou ponto 0.");
					}	
				}
			}
		}
		
		System.out.println(" EX:  _______________");
		System.out.println("     |       |       |");
		System.out.println("     |   Q2  |  Q1   |");
		System.out.println("     |       |       |");
		System.out.println("     |-------+-------|");
		System.out.println("     |       |       |");
		System.out.println("     |   Q3  |  Q4   |");
		System.out.println("     |_______|_______|");
		
		sc.close();

	}

}
