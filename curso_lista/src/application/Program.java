package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();

		list.add("bruno");
		list.add("gerlin");
		list.add("assalaia");
		list.add("abacaxoraio");
		list.add(2, "balanoio");
		
		System.out.println(list.size());
		
	
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------");	
		
		list.removeIf(x -> x.charAt(0) == 'a' );
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------");
		
		System.out.println("Idex of balanoio: " + list.indexOf("balanoio")); 
		
		System.out.println("---------------------------------");
		
		String name = list.stream().filter(x-> x.charAt(0)== 'g').findFirst().orElse(null);
		System.out.println(name);
		
	}
	
	
	
	

}
