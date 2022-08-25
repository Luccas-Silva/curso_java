package application;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Set part 1");
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Luccas");
		set.add("Alanzoka");
		set.add("Philadelphia");
		set.add("Miami");
		
		set.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println(set.contains("Luccas") +(" = Luccas"));
		sc.close();
		
		for(String n: set) {
			System.out.println(n);
		}
		
		
		System.out.println();
		System.out.println("Set part 2");
		set2();
	}
	
	public static void set2() {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
		sc.close();
	}

}
