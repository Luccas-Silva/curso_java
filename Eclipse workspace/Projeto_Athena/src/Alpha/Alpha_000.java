package Alpha_00;
import java.util.Scanner;

public class Alpha_000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String horas;
		System.out.print("	Digite o horario de hoje: ");
		horas = sc.nextLine();
		String[] vetHoras = horas.split(":");
		int numConvertido = Integer.parseInt(vetHoras[0]);
	
		String nome;
		System.out.print("	Digite seu nome: ");
		nome = sc.nextLine();
		String[] vetNome = nome.split(" ");
		
		System.out.println("");
		System.out.println(" Atena:");
		if (numConvertido >= 0 && numConvertido < 12) {
			System.out.print(" Bom Dia ");
			System.out.println(vetNome[0]);
		}
		else if (numConvertido >= 18 && numConvertido <= 23) {
			System.out.print(" Boa Noite ");
			System.out.println(vetNome[0]);
		}
		else {
			System.out.print(" Boa Tarde ");
			System.out.println(vetNome[0]);
		}
		
		System.out.println(" Meu nome é Atena, eu sou o projeto de I.A ou inteligência artificial do Sr.Luccas.");
		System.out.println(" Gostaria de me fazer uma pergunta?(sim/não)");
                                        		
		String resposta;             
		System.out.print(" Resposta: ");
		resposta = sc.nextLine();
		System.out.println(" " +resposta+ " que legal, mais lamento mas não consigo responder no momento.");
		
		sc.close();

	}

}
