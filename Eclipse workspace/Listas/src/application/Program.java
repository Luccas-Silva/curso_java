package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List <String> list =  new ArrayList<>();
		
		list.add("Gerson");
		list.add("Andreia");
		list.add("Bia");
		list.add("Luiza");
		list.add("Luccas");
		list.add("João");
		list.add(3, "Luciano");
		
		System.out.println("Nomes na Lista: "+ list.size());
		System.out.println("---------------");
		list.remove("Luciano");
		
		for (String nome: list) {
			System.out.println(nome);
		}
		System.out.println("---------------");
		
		list.removeIf(x -> x.charAt(0) == 'L');
		for (String nome: list) {
			System.out.println(nome);
		}
		System.out.println("---------------");
		
		System.out.println("Index Of Andreia: "+ list.indexOf("Andreia"));
		System.out.println("Index Of Luciano: "+ list.indexOf("Luciano"));
		System.out.println("---------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
		for (String nome: result) {
			System.out.println(nome);
		}
		System.out.println("---------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
	}

}
