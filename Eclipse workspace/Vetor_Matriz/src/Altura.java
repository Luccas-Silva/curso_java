import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("	Altura Média");
		System.out.println();
		
		int Num;
		double Med = 0.0;
		
		System.out.print("Digite o número de pessoas: ");
		Num = sc.nextInt();
		
		double [] Vet = new double [Num];
		
		System.out.println();
		for (int i=0; i<Num; i++) {
			System.out.print("Digite a altura da " +(i+1)+ "º pessoas: ");
			Vet [i] = sc.nextDouble();
			Med += Vet [i];
		}
		
		Med = Med / Num;
		System.out.println();
		System.out.printf("Altura Média das pessoas: %.2f %n", Med);
		
		sc.close();

	}

}
