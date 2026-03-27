package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Fernando");
		list.add("Marcos");
		list.add("Ana");
		list.add("Francisco");
		list.add("João");
		
		list.add(2, "Maria");
		
		for(String n : list) {
			System.out.println(n);
		}
		
		System.out.println(list.size());
		
		System.out.println("----------");		
		
//		list.removeIf(x -> x.charAt(0) == 'M'); // Remove todos nomes iniciados com M
		
		for(String n : list) {
			System.out.println(n);
		}
		
		System.out.println("----------");
		System.out.println("Index of Ana: " + list.indexOf("Ana"));
		System.out.println("Index of Paulo: " + list.indexOf("Paulo"));
		
		System.out.println("----------");
		
//		List<String> filteredList = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList()); // lista mutável Java 8 >
		List<String> filteredList = list.stream().filter(x -> x.charAt(0) == 'F').toList(); // lista imutável Java 16 >
		for (String n : filteredList) {
			System.out.println(n);
		}
		
		System.out.println("----------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
		System.out.println(name);

	}

}
 