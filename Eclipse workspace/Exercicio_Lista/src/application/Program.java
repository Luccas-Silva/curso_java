package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Sistema_Lista;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("	* Sistema_Lista *");
		System.out.println("");
		
		List <Sistema_Lista> list = new ArrayList<>();
		
		System.out.print("Digite o número de Produtos que serão cadastrados: ");
		int numP = sc.nextInt();
		
		for (int i=0; i<numP; i++) {
			System.out.println("");
			System.out.println("Produto #"+(i+1));
			System.out.print("codigo: ");
			sc.nextLine();
			String codigo = sc.nextLine();
			System.out.print("nome: ");
			String nome = sc.nextLine();
			System.out.print("quantidade: ");
			int quantidade = sc.nextInt();
			System.out.print("valor: ");
			double valor = sc.nextDouble();
			
			Sistema_Lista Produto = new Sistema_Lista(codigo, nome, quantidade, valor);
			list.add(Produto);
		}
		
		int op;
		do {
			System.out.println("");
			System.out.println("	* Opções *");
			System.out.println(" (1) Cadastra um produto");
			System.out.println(" (2) Remover um produto");
			System.out.println(" (3) Ver lista");
			System.out.println(" (0) Ver lista e Finalizar ");
			System.out.print("    Digite um numero: ");
			op = sc.nextInt();
			
			if (op == 1) {
				System.out.println("");
				System.out.println("Produto #"+(list.size()+1));
				System.out.print("codigo: ");
				sc.nextLine();
				String codigo = sc.nextLine();
				System.out.print("nome: ");
				String nome = sc.nextLine();
				System.out.print("quantidade: ");
				int quantidade = sc.nextInt();
				System.out.print("valor: ");
				double valor = sc.nextDouble();
				
				Sistema_Lista Produto = new Sistema_Lista(codigo, nome, quantidade, valor);
				list.add(Produto);
			}
			
			else if (op == 2) {
				System.out.println("");
				System.out.print("Digite o numero do produto na lista: ");
				int remv = sc.nextInt();
				list.remove(remv-1);
			}
			
			else if (op == 3) {
				System.out.println("");
				System.out.println("   Lista de Produtos:");
				for (Sistema_Lista Produtos: list) {
					System.out.println(Produtos);
				}
			}
			
		}while(op != 0);
		
		System.out.println("");
		System.out.println("   Lista de Produtos:");
		for (Sistema_Lista Produtos: list) {
			System.out.println(Produtos);
		}
		System.out.println("");
		System.out.println(" Obrigada por usar o sistema de Lista Shield.");
		
		sc.close();
	}

}
