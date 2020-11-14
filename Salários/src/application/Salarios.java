package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Salarios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> empregados = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int employees = sc.nextInt();
		
		for (int i=1; i <= employees; i++) {
			System.out.printf("Employee #%d data:\n", i);
			System.out.print("Outsourced (y/n)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			if (resp == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				empregados.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else
				empregados.add(new Employee(name, hours, valuePerHour));
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : empregados) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
