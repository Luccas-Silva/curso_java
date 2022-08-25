import java.util.Scanner;

public class MainVIII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, Y;
		
		System.out.println("Dois carros (X e Y) partem em uma mesma direção. ");
		System.out.println("O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h");
		System.out.println("");
		System.out.print("calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro: ");
		Y = sc.nextInt();
		N = 2 * Y;
		System.out.println(N +" Minutos");
		
		sc.close();
	}

}
