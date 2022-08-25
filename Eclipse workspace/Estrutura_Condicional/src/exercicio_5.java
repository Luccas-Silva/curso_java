import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int cod, quanti;
		double totalR = 0.0, total = 0.0 ;
		char cont;
		
		System.out.println("		* Exercício 05 *");
		System.out.println("");
		
		do {
			System.out.println("	Código	Escificacação	Preço");
			System.out.println("	  1	Cachorro Quente	R$ 4,00");
			System.out.println("	  2	X-Salada	R$ 4,50");
			System.out.println("	  3	X-Bacon		R$ 5,00");
			System.out.println("	  4	Torrada Simples	R$ 2,00");
			System.out.println("	  5	Refrigerante	R$ 1,00");
			
			
			System.out.println("");
			System.out.print("	Digite o código do produto: ");
			cod = sc.nextInt();
			System.out.print("	Digite o número de quantidade ao ser comprado: ");
			quanti = sc.nextInt();
			
			if (cod == 1) {
				total = quanti * 4.00;
			}
			else if (cod == 2) {
				total = quanti * 4.50;
			}
			else if (cod == 3) {
				total = quanti * 5.00;
			}
			else if (cod == 4) {
				total = quanti * 2.00;
			}
			else if (cod == 5) {
				total = quanti * 1.00;
			}
			else {
				System.out.println("	* Código inválido *");
			}
			
			totalR = totalR + total;  
			System.out.println("");
			System.out.print("	Desecha continuar (Sim/Não): ");
			cont = sc.next().charAt(0);
			System.out.println("");
			
		}while(cont == 's' || cont == 'S');
		
	
		System.out.printf("		Total = R$ %.2f  %n" ,totalR);
		
		sc.close();

	}

}
