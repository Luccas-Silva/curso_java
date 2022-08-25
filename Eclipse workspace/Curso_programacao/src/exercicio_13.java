import java.util.Scanner;

public class MainXIII {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n, r, h, m, s;
		
		System.out.println("Conversão de Tempo");
		System.out.print("Digite o tempo: ");
		n = sc.nextInt();
		
		h = n / 3600;
		r = n % 3600;
		
		m = r / 60;
		s = r % 60;
				
		System.out.println(h + ":" + m + ":" + s);
		
		sc.close();
	}

}
