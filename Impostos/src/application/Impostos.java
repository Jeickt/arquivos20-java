package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Impostos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> impostos = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int payers = sc.nextInt();
		
		for (int i=1; i <= payers; i++) {
			System.out.printf("Tax payer #%d data:\n", i);
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual Income: ");
			double renda = sc.nextDouble();
			
			if (resp == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				impostos.add(new PessoaFisica(nome, renda, gastosSaude));
			}
			else {
				System.out.print("Number of Employees: ");
				int funcionarios = sc.nextInt();
				impostos.add(new PessoaJuridica(nome, renda, funcionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Contribuinte contr : impostos) {
			System.out.printf(contr.getNome() + ": $ %.2f\n", contr.impostoAPagar());
		}
		
		double total = 0.0;
		for (Contribuinte contr : impostos) {
			total += contr.impostoAPagar();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", total);
		
		sc.close();
	}

}
