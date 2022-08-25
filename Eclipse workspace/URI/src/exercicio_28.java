import java.util.Scanner;

public class XXVIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	 
		String atributo1, atributo2, atributo3;
		
		System.out.println(" -----------------");
		System.out.println("   Qual o Animal");
		System.out.println(" -----------------");
		System.out.println("");
		
		System.out.print(" Digite se o animal e (Vertebrado) ou (Invertebrado): ");
		atributo1 = sc.nextLine();
		
		if (atributo1 .equals ("vertebrado")) {
			
			System.out.print(" O animal e (Ave) ou (Mamifero): ");
			atributo2 = sc.nextLine();
			
			if (atributo2 .equals ("ave")) {
				
				System.out.print(" O animal e (Carnivoro) ou (Onivoro): ");
				atributo3 = sc.nextLine();
				
				if (atributo3 .equals ("carnivoro")) {
					System.out.println(" * O animal e uma AGUIA! *");
					
				}
				else {
					System.out.println(" * O animal e uma POMBA! *");
				}
			}
			
			else {
				System.out.print(" O animal e (Onivoro) ou (Herbivoro): ");
				atributo3 = sc.nextLine();
				
				if (atributo3 .equals("onivoro")) {
					System.out.println(" * O animal e um HUMANO! *");	
				}
				else {
					System.out.println(" * O animal e um VACA! *");
				}
				
			}
			
		}
		else {
			System.out.print(" O animal e (Inseto) ou (Anelideo): ");
			atributo2 = sc.nextLine();
			
			if (atributo2 .equals ("inseto")) {
				System.out.print(" O animal e (Hematofago) ou (Herbivoro): ");
				atributo3 = sc.nextLine();
				
				if (atributo3 .equals("hematofago")) {
					System.out.println(" * O animal e uma PULGA! *");
				}
				else {
					System.out.println(" * O animal e uma LAGATA! *");
				}
			}
			else {
				System.out.print(" O animal e (Hematofago) ou (Onivoro): ");
				atributo3 = sc.nextLine();
				
				if (atributo3 .equals ("Hematofago")) {
				System.out.println(" * O animal e uma SANGUESSUGA! *");
				}
				else {
					System.out.println(" * O animal e uma MINHOCA! *");
				}
			}
		}
			
		
		sc.close();

	}

}
