package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
		
		System.out.println("	* Sistema de Receita *");
		System.out.println("");
		
		System.out.print("Digite o nome do departamento: ");
		String departName = sc.nextLine();
		System.out.println("");
		
		System.out.println("Digite os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Salário-base: ");
		double salarioBase = sc.nextDouble();
		Worker worker = new Worker (nome, WorkerLevel.valueOf(level), salarioBase, new Department (departName));  
		System.out.println("");
		
		System.out.print("Quantos contratos para este trabalhador? ");
		int contras = sc.nextInt();
		
		for (int i=1; i<=contras; i++) {
			System.out.println("--------------------------------------");
			System.out.print("Insira os dados do contrato nº "+i+":");
			System.out.print("Data (DD/MM/YYYY): ");
			Date contrasDate = sdf.parse(sc.next());
			System.out.print("Valor por Hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração em Horas: ");
			int horas = sc.nextInt();
			HourContract contract =  new HourContract(contrasDate, horas, valorPorHora);
			worker.addContract(contract);
			
		}
		
		System.out.println("");
		System.out.print("Insira o mês e o ano para calcular a receita (MM/YYYY): ");
		String monthAndYear = sc.next();
		int monthP = Integer.parseInt(monthAndYear.substring(0, 2));
		int yearP = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: "+ worker.getName());
		System.out.println("Departamento: "+ worker.getDepartment().getName());
		System.out.println("Renda para "+ monthAndYear +": "+ worker.income(yearP, monthP));
		
		sc.close();

	}

}
