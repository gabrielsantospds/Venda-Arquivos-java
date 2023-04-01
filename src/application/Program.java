package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file path: ");
		String path = sc.next();
		
		Product[] products = new Product[2];
		
		for(int i = 0; i < 2; i++) {
			System.out.print("Name: ");
			String productName = sc.next();
			System.out.print("Price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuant = sc.nextInt();
			
			products[i] = new Product(productName, productPrice, productQuant);
			
		}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
				
				for(Product product : products) {
					bw.write(product.toString());
					bw.newLine();
				}
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Enter the new path: ");
			String newPath = sc.next();
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))) {
				
				for(Product product : products) {
					bw.write(product.getName() + ", " + product.totalPrice());
					bw.newLine();
				}
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		
	}

}
