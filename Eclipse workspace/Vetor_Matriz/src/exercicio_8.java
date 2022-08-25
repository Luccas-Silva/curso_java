import java.util.Scanner;

public class VIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N;
		double []altura;
		char []sexo;
		
		System.out.println("");
		System.out.print(" Digite o número de participantes: ");
		N = sc.nextInt();
		
		altura = new double [N];
		sexo = new char [N];
		
		for (int I = 0; I < N; I++) {
			System.out.println("");
			System.out.print(" Digite a altura da pessoa: ");
			altura[I] = sc.nextDouble();
			System.out.print(" Digite o sexo [M/F]: ");
			sexo[I] = sc.next().charAt(0);
		}
		
		double maior = 0;
		
		for (int I = 0; I < N; I++) {
			if (altura[I] > maior) {
				maior = altura[I];
			}
		}
		
		double menor = altura[0];
		
		for (int I = 0; I < N; I++) {
			if (altura [I] < menor) {
				menor = altura[I];
			}
		}
		
		double contF = 0, media = 0;
		
		for (int I = 0; I < N; I++) {
			if (sexo[I] == 'F') {
				media = media + altura[I];
				contF++;
			}
			media = media / contF;
		}
		
		int contM = 0;
		
		for (int I = 0; I < N; I++) {
			if (sexo[I] == 'M') {
				contM++;
			}
		}
		
		System.out.println("");
		System.out.printf(" Maior altura = %.2f %n", maior);
		System.out.printf(" Menor altura = %.2f %n", menor);
		System.out.printf(" Media das alturas das mulheres = %.2f %n", media);
		System.out.println(" Numero de homens = "+contM);
		
		sc.close();

	}

}
