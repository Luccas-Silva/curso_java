package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Sistema_Registro;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		List <Sistema_Registro> list = new ArrayList<>();
		
		System.out.print("Digite o número de funcionários que serão registrados: ");
		int NumP = sc.nextInt();
		
		for (int i=0; i<NumP; i++) {
			System.out.println("");
			System.out.println("funcionário #" +(i+1)+ ":");
			System.out.print("ID: ");
			Integer ID = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Sistema_Registro funcionario = new Sistema_Registro(ID, nome, salario);
			list.add(funcionario);
		}
		
		System.out.println("");
		System.out.print("Digite o ID do funcionário que terá um aumento: ");
		int aumentoID = sc.nextInt();
		Integer posi = posicao (list, aumentoID);
		if (posi == null) {
			System.out.println("ID digitado não existe.");
		}
		else {
			System.out.print("Digite um percentual para o aumento: ");
			double percentual =  sc.nextDouble();
			list.get(posi).incrementoSalario(percentual);
		}
		
		System.out.println("");
		System.out.println("Lista de funcionários");
		for (Sistema_Registro funcionario: list) {
			System.out.println(funcionario);
		}

		
		sc.close();
		
	}
	
	public static Integer posicao(List <Sistema_Registro> list, int id) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getID() == id) {
				return i;
			}
		}
		return null;
	}

}
