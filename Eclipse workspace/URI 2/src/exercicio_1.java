import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double X, Y;
		
		//X = latitude / Y = longitude//
		
		X = 1;
  		Y = 1;
  		
		System.out.println("    Coordenadas de um Ponto");
		System.out.println("");
		
		while (X != 0 && Y != 0) {
			
			System.out.print(" Digite as coordenadas (X). Pode der (,) : ");
			X = sc.nextDouble();
			System.out.print(" Digite as coordenadas (Y). Pode der (,) : ");
			Y = sc.nextDouble();
			System.out.println("");
			
			if (X >= 1 && Y >= 1) {
				System.out.println(" Resposta: Q1");
				System.out.println("");
			}
			else {
				if (X <= -1 && Y >= 1) {
					System.out.println(" Resposta: Q2");
					System.out.println("");
				}
				else {
					if (X <= -1 && Y <= -1) {
					    System.out.println(" Resposta: Q3");
					    System.out.println("");
					}
					else {
						if (X >= 1 && Y <= -1) {
							System.out.println(" Resposta: Q4");
							System.out.println("");
						}
						else {
							System.out.println(" Resposta: Origem ou ponto 0.");
							System.out.println("");
						}
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
