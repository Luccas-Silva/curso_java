package appilcation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Progarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> DS = new HashSet<>();
		Set<Integer> BD = new HashSet<>();
		Set<Integer> PW = new HashSet<>();
		
		System.out.print("How many students for course DS ? ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.print("Code Student: ");
			int CodeStudent = sc.nextInt();
			DS.add(CodeStudent);
		}
		
		System.out.println();
		System.out.print("How many students for course BD ? ");
		num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.print("Code Student: ");
			int CodeStudent = sc.nextInt();
			BD.add(CodeStudent);
		}
		
		System.out.println();
		System.out.print("How many students for course PW ? ");
		num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.print("Code Student: ");
			int CodeStudent = sc.nextInt();
			PW.add(CodeStudent);
		}
		
		Set<Integer> total = new HashSet<>(DS);
		total.addAll(BD);
		total.addAll(PW);
		System.out.println();
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}
}
