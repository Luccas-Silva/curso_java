import java.util.Locale;
import java.util.Scanner;

public class XXV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in);
		
		double n1, n2, n3, n4, med;
		
		System.out.println(" ====================");
		System.out.println("        Média");
		System.out.println(" ====================");
		
		System.out.print(" Digite a 1º nota: ");
		n1 = sc.nextDouble();
		System.out.print(" Digite a 2º nota: ");
		n2 = sc.nextDouble();
		System.out.print(" Digite a 3º nota: ");
		n3 = sc.nextDouble();
		System.out.print(" Digite a 4º nota: ");
		n4 = sc.nextDouble();
		
		med = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println(" ===================");
		System.out.printf("     Media: %.1f %n ", med);
		System.out.println("===================");
		
		if (med >= 7) {
			System.out.print("   Aluno aprovado.");
		}
		else {
			if(med < 5) {
			   System.out.print("   Aluno reprovado.");
			}
			else {
				 
				double exa , medF;
				
				System.out.println("   Aluno em exame.");
				System.out.println(" ===================");
				System.out.print("   Nota do exame: ");
				exa = sc.nextDouble();
				
				medF = (exa + med) / 2;
				
				System.out.println(" ===================");
				System.out.printf("   Media final: %.1f %n ", medF);
				System.out.println("===================");
				
				if (medF > 5) {
					System.out.println("   Aluno aprovado.");
				}
				else {
					System.out.println("   Aluno reprovado.");	
				}
			}
		}
		
		
		sc.close();

	}

}
