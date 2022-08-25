import java.util.Scanner;

public class XXII {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int HI, HF, Du;
		
		System.out.println("Tempo de Jogo");
		System.out.print("Hora que começou: ");
		HI = sc.nextInt();
		System.out.print("Hora que acabou: ");
		HF = sc.nextInt();
		
		if (HI < HF) {
			Du = HI - HF;
		}
		else {
			Du = 24 - HI + HF;
		}
		
		System.out.println("O JOGO DUROU " + Du + " HORA(S)");
		
		sc.close();

	}

}
