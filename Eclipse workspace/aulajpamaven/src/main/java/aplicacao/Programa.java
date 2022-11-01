package aplicacao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		for(int i=1; i<=10; i++) {
			
			Pessoa p = em.find(Pessoa.class, i);
			
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
			
			System.out.println(p);
		}
		
		System.out.println("Pronto");	
		
		em.clear();
		emf.close();
		sc.close();

	}

}
