import java.util.Scanner;

public class XXIII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double S, NS, Per;
		
		System.out.println(" -----------------------------------------------");
		System.out.println("|       Salário      | Percentual de Reajuste   |");
		System.out.println(" -----------------------------------------------");
		System.out.println("|        0 -  400.00            15%             |");
		System.out.println("|   400.01 -  800.00            12%             |");
		System.out.println("|   800.01 - 1200.00            10%             |");
		System.out.println("|  1200.01 - 2000.00             7%             |");
		System.out.println("|   Acima de 2000.00             4%             |");
		System.out.println(" -----------------------------------------------");
		
		System.out.println(" Digite o seu salário para o Reajuste.");
		System.out.print("         Salário: R$ ");
		S = sc.nextDouble();
		System.out.println("------------------------------------------------");
		        
		if (S <= 400.00) {
			
			NS = ((S * 15) / 100) + S;
			Per = ((S * 15) / 100);
			
			System.out.printf("         Novo salario: R$ %.2f %n", NS);
			System.out.printf("         Reajuste ganho:R$ %.2f %n", Per);
			System.out.println("         Em percentual:  15%");
		}
		else {
			if (S > 400.01 && S <= 800.00) {
				
				NS = ((S * 12) / 100) + S;
				Per = ((S * 12) / 100);
				
				System.out.printf("         Novo salario: R$ %.2f %n", NS);
				System.out.printf("         Reajuste ganho:R$ %.2f %n ", Per);
				System.out.println("         Em percentual: 12%");
			}
			else {
				if (S > 800.01 && S <= 1200.00) {
					
					NS = ((S * 10) / 100) + S;
					Per = ((S * 10) / 100);
					
					System.out.printf("         Novo salario: R$ %.2f %n", NS);
					System.out.printf("         Reajuste ganho:R$ %.2f %n", Per);
					System.out.println("         Em percentual: 10%");
				}
				else {
					if (S > 1200.01 && S <= 2000.00 ) {
						
						NS = ((S * 7) / 100) + S;
						Per = ((S * 7) / 100);
						
						System.out.printf("         Novo salario: R$ %.2f %n", NS);
						System.out.printf("         Reajuste ganho:R$ %.2f %n", Per);
						System.out.println("         Em percentual: 7 %");
					}
					else {
						if (S > 2000.00) {
							
							NS = ((S * 4) / 100) + S;
							Per = ((S * 4) / 100);
							
							System.out.printf("         Novo salario: R$ %.2f %n", NS);
							System.out.printf("         Reajuste ganho:R$ %.2f %n", Per);
							System.out.println("         Em percentual: 4%");
						}
					}
				}
			}
		}
		System.out.println("------------------------------------------------");
		
		sc.close();

	}

}
