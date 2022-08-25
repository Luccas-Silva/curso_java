import java.util.Scanner;

public class MainIXX {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x;
		String dia;
		
		System.out.print("Digite um numero de 1 a 10 : ");
		x = sc.nextInt();
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor invalido";
			break;	
		}
		
		if (x < 8) {
			
			System.out.println("Dia da semana: " + dia);	
		}
		else {
			System.out.println (dia);
		}
		
		
		sc.close();

	}

}
