import java.util.Scanner;

public class III {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tipo, Alcool, Gasolina, Diesel;
		
		tipo = 0;
		Alcool = 0;
		Gasolina = 0;
		Diesel = 0;
		
		System.out.println(" Tipo de Combustível");
		System.out.println("    ___________");
		System.out.println("   |1.Álcool   |");
		System.out.println("   |2.Gasolina |");
		System.out.println("   |3.Diesel   |");
		System.out.println("   |4.Fim      |");
		System.out.println("   |___________|");
		System.out.println("");
		
		while (tipo != 4) {
			System.out.print(" Digite um numero: ");
			tipo = sc.nextInt();
			
			if (tipo == 1) {
				Alcool = (Alcool + 1);
			}
			else {
				if (tipo == 2) {
					Gasolina = (Gasolina + 1);
				}
				else {
					if (tipo == 3) {
						Diesel = (Diesel + 1);
					}
				}
			}
			System.out.println("");
		}
		
		System.out.println(" MUITO OBRIGADO");
		System.out.println("");
		System.out.println(" Alcool: "+ Alcool);
		System.out.println(" Gasolina: "+ Gasolina);
		System.out.println(" Diesel: "+ Diesel);
		
		
		sc.close();

	}

}
