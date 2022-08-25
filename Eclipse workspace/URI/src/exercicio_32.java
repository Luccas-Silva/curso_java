import java.util.Scanner;

public class XXXII {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int ddd;
		
		System.out.println("  ----------------------------");
		System.out.println(" |   DDD    |   Destination   |");
		System.out.println(" |    61    |    Brasilia     |");
		System.out.println(" |    71    |    Salvador     |");
		System.out.println(" |    11    |   Sao Paulo     |");
		System.out.println(" |    21    | Rio de Janeiro  |");
		System.out.println(" |    32    |  Juiz de Fora   |");
		System.out.println(" |    19    |    Campinas     |");
		System.out.println(" |    27    |    Vitoria      |");
		System.out.println(" |    31    | Belo Horizonte  |");
		System.out.println("  ----------------------------");
		System.out.println("");
		
		System.out.print("  Digite o DDD: ");
		ddd = sc.nextInt();
		
		switch (ddd) {
		case 61 :
			System.out.print("  Brasilia");
			break;
		case 71 :
			System.out.print("  Salvador");
			break;
		case 11 :
			System.out.print("  Sao Paulo");
			break;
		case 21 :
			System.out.print("  Rio de Janeiro");
			break;
		case 32 :
			System.out.print("  Juiz de Fora");
			break;
		case 19 :
			System.out.print("  Campinas");
			break;
		case 27 :
			System.out.print("  Vitoria");
			break;
		case 31 :
			System.out.print("  Belo Horizonte");
			break;
		default:
			System.out.print("  DDD nao cadastrado");
			break;
		}
		
		sc.close();
	}

}
