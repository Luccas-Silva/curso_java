import java.util.Scanner;

public class IX {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N; 
		double lucroSoma, vendaSoma, compraSoma;
		String [] nome;
		double [] compra;
		double [] venda;
		double [] lucro;
		
		lucroSoma = 0;
		vendaSoma = 0;
		compraSoma = 0;
		
		System.out.println("		Lucro de Mercadorias");
		System.out.println("");
		System.out.print(" Digite o número de mercadorias a ser analisada: ");
		N = sc.nextInt();
				
		nome = new String [N];
		compra = new double [N];
		venda = new double [N];
		lucro = new double [N];
		
		for (int I = 0; I < N; I++) {
			System.out.println("");
			System.out.print(" Digite o nome da mercadoria: ");
			nome[I] = sc.next();
			System.out.print(" Digite o valor de compra da mercadoria: ");
			compra[I] = sc.nextDouble();
			System.out.print(" Digite o valor de venda damercadoria: ");
			venda[I] = sc.nextDouble();
			
			lucro[I] = venda[I] - compra[I];
			vendaSoma =  vendaSoma + venda[I];
			compraSoma = compraSoma + compra[I];
			lucroSoma = lucroSoma + lucro[I];	
		}
		
		int lucroBaixo = 0;
		for (int I = 0; I < N; I++) {
			if (10 > venda[I] / lucro[I] ) {
				lucroBaixo++;
			}
		}
		
		int lucroEntre = 0;
		for (int I = 0; I < N; I++) {
			if (10 > (venda[I] / lucro[I]) || (venda[I] / lucro[I]) < 20) {
				lucroEntre++;
			}
		}
		
		int lucroAcima = 0;
		for (int I = 0; I < N; I++) {
			if ((venda[I] / lucro[I]) > 20) {
				lucroAcima++;
			}
		}
		
		System.out.println("");
		System.out.println("Lucro abaixo de 10%: " +lucroBaixo);
		System.out.println("Lucro entre 10% e 20%: " +lucroEntre);
		System.out.println("Lucro acima de 20%: " +lucroAcima);
		System.out.printf("Valor total de compra: %.2f %n", compraSoma);
		System.out.printf("Valor total de venda: %.2f %n", vendaSoma);
		System.out.printf("Lucro total: %.2f %n", lucroSoma);
		
		
		sc.close();

	}

}
