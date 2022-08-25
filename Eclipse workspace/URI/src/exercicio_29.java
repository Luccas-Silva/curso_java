
import java.util.Locale;
import java.util.Scanner;

public class XXIX {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double Renda, Imposto ;
		
		System.out.println(" ------------------------------------------------");
		System.out.println("|        Renda               | Imposto de Renda  |");
		System.out.println("|  De 0.00 a R$ 2000.00      |       Iseto       |");
		System.out.println("|  R$ 2000.01 até R$ 3000.00 |         8%        |");
		System.out.println("|  R$ 3000.01 até R$ 4500.00 |        18%        |");
		System.out.println("|  Acima de R$ 4500.00       |        28%        |");
		System.out.println(" ------------------------------------------------");
		System.out.println("");
		System.out.print(" Digite o valor para ser calculada: R$ ");
		Renda = sc.nextDouble();
		
		if (Renda == 0.00 || Renda == 2000) {
			System.out.println(" Iseto");
		}
		else {
			if (Renda > 2000.01 || Renda ==3000) {
				Imposto = (Renda * 8)/100;
				System.out.println(" Imposto em cima do produto, e igual a " + Imposto );
			}
			else {
				if (Renda > 3000.01 || Renda == 4500) {
					Imposto = (Renda * 18)/100;
					System.out.println(" Imposto em cima do produto, e igual a " + Imposto );
				}
				else {
					Imposto = (Renda * 28)/100;
					System.out.println(" Imposto em cima do produto, e igual a " + Imposto );
				}
			}
		}
		
		sc.close();

	}

}
