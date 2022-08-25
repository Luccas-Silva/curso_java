import java.util.Scanner;

public class XVII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("				* Experiências *");
		System.out.println("");
		System.out.println("   Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para");
		System.out.println(" organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano,");
		System.out.println(" quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.");
		System.out.println("");
		System.out.println("   Este laboratório em especial utiliza três tipos de cobaias: *sapos*, *ratos* e *coelhos*. Para obter estas");
		System.out.println(" informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia");
		System.out.println(" utilizada e a quantidade de cobaias utilizadas em cada experimento.");
		System.out.println("");
		System.out.println("");
		
		int nt, quan, sapos, ratos, coelhos, totalQua;;
		char tipo;
		 
		sapos = 0;
		ratos = 0;
		coelhos = 0;
		totalQua = 0;
		
		System.out.print("	Digite o numero de Testes: ");
		nt = sc.nextInt();
		System.out.println("");
		
		if (1 <= nt && nt <= 15 ) {
			for (int i = 1; i <= nt; i++) {
				
				System.out.print("   Digite a Quantidade de cobaias: ");
				quan = sc.nextInt();
				System.out.println("");
				System.out.println("   Qual o tipo de cobaia.");
				System.out.print("   Digite S (sapos), R (ratos) ou C (coelhos): ");
				tipo = sc.next().charAt(0);
				System.out.println("");
				
				if (tipo == 'S' || tipo == 's') {
					sapos = sapos + quan;
				}
				else {
					if (tipo == 'R' || tipo == 'r') {
						ratos = ratos + quan;
					}
					else {
						if (tipo == 'C' || tipo == 'c') {
							coelhos = coelhos + quan;
						}
					}
				}
				
				totalQua = totalQua + quan;
				
			}
		}
		else {
			System.out.println("	O numero de Testes de que ser menor que 15 e maior que 0.");
		}
		
		System.out.println("	Total: " +totalQua+ " cobaias");
		System.out.println("	Total de coelhos: " +coelhos);
		System.out.println("	Total de ratos: " +ratos);
		System.out.println("	Total de sapos: " +sapos);
		
		double coelhos1 = (double) coelhos / totalQua * 100;
		double ratos1 = (double) ratos / totalQua * 100;
		double sapos1 = (double) sapos / totalQua * 100;
		
		System.out.printf("	Percentual de coelhos: %.2f %%.%n", coelhos1);
		System.out.printf("	Percentual de ratos: %.2f %%.%n", ratos1);
		System.out.printf("	Percentual de sapos: %.2f %%.%n", sapos1);
		
		
		sc.close();

	}

}
