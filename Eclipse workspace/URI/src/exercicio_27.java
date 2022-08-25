import java.util.Scanner;

public class XXVII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int HI, MI, HF, MF;
		
		System.out.print(" Digite as Horas que comesou o jogo:");
		HI = sc.nextInt();
		System.out.print(" Digite os Minutos que comesou o jogo:");
		MI = sc.nextInt();
		System.out.print(" Digite as Horas que acabou o jogo:");
		HF = sc.nextInt();
		System.out.print(" Digite os Minutos que acabou o jogo:");
		MF = sc.nextInt();
		
		int intanI = HI * 60 + MI; 
		int intanF = HF * 60 + MF;
		
		int Dura, DuraH, DuraM;
		
		if (intanI < intanF) {
			Dura = intanF - intanI ;
		}
		else {
			Dura = (24 * 60 - intanI)+ intanF ;
		}
		
		DuraH = Dura / 60;
		DuraM = Dura % 60;
		
		System.out.println(" O jogo durou " +DuraH+ " Horas e " +DuraM+ " minutos");
		
		sc.close();

	}

}
