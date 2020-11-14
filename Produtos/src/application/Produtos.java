package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Produtos {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> produtos = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int products = sc.nextInt();
		
		for (int i=1; i <= products; i++) {
			System.out.printf("Product #%d data:\n", i);
			System.out.print("Commom, used or imported (c/u/i)? ");
			char resp = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (resp == 'u') {
				System.out.print("Manufacture Date: ");
				Date manufactureDate = sdf.parse(sc.next());
				produtos.add(new UsedProduct(name, price, manufactureDate));
			}
			else if (resp == 'i') {
				System.out.print("Customs Fee: ");
				double customsFee = sc.nextDouble();
				produtos.add(new ImportedProduct(name, price, customsFee));
			}
			else {
				produtos.add(new Product(name, price));
			}
		}
			
		System.out.println();
		System.out.println("PRYCE TAGS:");
		for (Product pro : produtos) {
			System.out.println(pro.priceTag());
		}
		sc.close();
	}
}