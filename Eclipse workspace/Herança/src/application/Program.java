package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		/*
		Account acc = new Account (1001, "Kian", 1.50);
		BusinessAccount bacc = new BusinessAccount (1002, "Alan", 500.0, 1000.0);
		
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "João", 200.0, 1000.0);
		Account acc3 = new SavingsAccount(1004, "Maria", 1500.0, 0.5);
		
		
		//DOWNCASTING
		
		BusinessAccount bacc1 = (BusinessAccount) acc2;
		bacc1.loan(150.0);
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount bacc2 = (BusinessAccount) acc3;
			bacc2.loan(150.0);
			System.out.println("Loan!");
		}
		else if (acc3 instanceof SavingsAccount) {
			SavingsAccount Sacc1 = (SavingsAccount) acc3;
			Sacc1.updateBalance();
			System.out.println("Update!");
		}
		
		System.out.println();
		System.out.println(acc.toString());
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println(acc3.toString());
		System.out.println("Business "+ bacc.toString());
		System.out.println("Business "+ bacc1.toString());
		System.out.println();
		
		
		//Introdução ao polimorfismo
		
		Account x = new Account (1020, "Alex", 1000.0);
		Account y = new SavingsAccount (1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.toString());
		System.out.println(y.toString());
		*/
		
		//Polimorfismo
		
		List <Account> list = new ArrayList <>(); 
		
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 500.00));
		list.add(new SavingsAccount(1003, "Alan", 500.00, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.00, 500.00));
		list.add(new SavingsAccount(1003, "Bibi", 300.00, 0.01));
		
		double soma = 0.0;
		for (Account acc : list) {
			soma += acc.getBalance();
		}
		System.out.printf("Total Balance: %.2f%n",soma);
		
		for (Account acc : list) {
			acc.deposit(10.00);;
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		sc.close();

	}

}
