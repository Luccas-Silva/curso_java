import java.util.Locale;
import java.util.Scanner;

public class MainXVIII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int D, D1, D2, H, H1, H2, M, M1, M2, S, S1, S2, inicio, fim, duracao, resto ;
		
		System.out.println("=============================");
		System.out.println("*     Tempo de um Evento    *");
		System.out.println("=============================");
		System.out.println("Inicio do evento:");
		
		System.out.print("Dia ");
		D1 = sc.nextInt();
		System.out.print("Horas: ");
		H1 = sc.nextInt();
		System.out.print("Minutos: ");
		M1 = sc.nextInt();
		System.out.print("Segundos: ");
		S1 = sc.nextInt();
		
		System.out.println("");
		System.out.println("Fim do evento:");
		System.out.print("Dia ");
		D2 = sc.nextInt();
		System.out.print("Horas: ");
		H2 = sc.nextInt();
		System.out.print("Minutos: ");
		M2 = sc.nextInt();
		System.out.print("Segundos: ");
		S2 = sc.nextInt();
		
		inicio =  D1 * 24 * 60 * 60  +  H1 * 60 * 60  +  M1 * 60  +  S1;
		fim =  D2 * 24 * 60 * 60  +  H2 * 60 * 60  +  M2 * 60  +  S2;
		duracao = fim - inicio;
		
		D  = duracao / ( 24 * 60 * 60 );
		resto = duracao % ( 24 * 60 * 60 );
		H  = resto / ( 60 * 60 );
		resto = resto % ( 60 * 60 );
		M  = resto /  60 ;
		S  = resto %  60 ;
		
		System.out.println("");
		System.out.println("Tempo do Evento");
		System.out.println( D  +  " dia (s) " );
		System.out.println( H  +  " hora (s) " );
		System.out.println( M  +  " minuto (s) " );
		System.out.println( S  +  " segundo (s) " );

		sc.close();

	}

}