import java.util.Scanner;

public class VII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nG, SN, gre, in, Emp, pgre, pin;
		
		nG = 0;
		Emp = 0;
		gre = 0;
		in = 0;
		pin = 0;
		pgre = 0; 
		
		System.out.println("      Grenais");
		System.out.println("");
		
		System.out.print(" Novo grenal (1-sim 2-nao): ");
		SN = sc.nextInt();
		
		while (SN == 1) {
			
			System.out.println("");
			System.out.print(" Numero de gols do Inter: ");
			in = sc.nextInt();
			System.out.print(" Numero de gols do Gremio: ");
			gre = sc.nextInt();
			
			nG = nG + 1;
			pin = pin + in;
			pgre = pgre + gre;
			
			if (gre == in) {
				Emp = Emp + 1;
			}
			System.out.println("");
			System.out.print(" Novo grenal (1-sim 2-nao): ");
			SN = sc.nextInt();
				
		}
		
		System.out.println("");
		System.out.println(" Numero de grenais: " +nG);
		System.out.println(" Numero de gols do Inter: " +pin);
		System.out.println(" Numero de gols do Gremio: " +pgre); 
		System.out.println(" Numero de Empates: " +Emp);
				 
		
		System.out.println("");
		System.out.println(" Final:");
		if (pin > pgre) {
			System.out.println(" Inter venceu mais jogos");
		}
		else {
			if (pgre > pin) {
				System.out.println(" Gremio venceu mais jogos");
			}
			else {
				System.out.println(" Empate");
			}
			
		}
		
		sc.close();

	}

}
