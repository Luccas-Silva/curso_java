import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("		* Exercício 04 *");
		System.out.println("");
		
		System.out.print("	Hora inicial de um jogo: ");
		horaInicial = sc.nextInt();
		System.out.print("	Hora final de um jogo: ");
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial - horaFinal;
		}
		
		System.out.println("	O jogo durou "  + duracao +  " hora (S) ");
		
		sc.close();

	}

}
