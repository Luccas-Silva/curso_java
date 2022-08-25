import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num, horas;
		double valHoras, sal;
		
		System.out.println("	* Exercício 04 *");
		System.out.println("");
		
		System.out.print("Leitor de número de funcionário: ");
		num = sc.nextInt();
		
		System.out.print("Seu número de horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.print("Valor que recebe por hora: ");
		valHoras = sc.nextDouble();
		
		sal = (double) valHoras * horas;
		
		System.out.println("");
		System.out.println("Valor do salário do funcionário número " +num);
		System.out.printf("	Salário = %.2f %n" ,sal);
		
		sc.close();
	}

}
