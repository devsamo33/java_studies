package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entiites.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);
			List<Employee> list = new ArrayList<>();
		
			
			
		
		
		System.out.print("How many employees willbe registred? ");
		int n = sc.nextInt();
	
		
		for (int i=1; i< n; i++) {
		System.out.println("Employee #" + i + ":");
		
		System.out.print("Id: ");
		int id = sc.nextInt();
		while  (hasId(list, id)) {
				System.out.print("id already take. Try again: ");
				id=sc.nextInt();
		}
	
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		sc.nextLine();
		
		System.out.print("salary: ");
		double salary = sc.nextDouble();
		
			
		list.add(new Employee(id, name, salary ));
		
		
		}
	
	
		System.out.println();
	System.out.println("id for increase salaray: ");
	int id = sc.nextInt();
	Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	if (emp == null) {
		System.out.println("This id does not exist!");
	}
	else {
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
	}
	System.out.println();
	System.out.println("List Of employee: \n");
	
	for(Employee obj  : list) {
	System.out.println(obj);
	}
			
	
	
		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter ( x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}

