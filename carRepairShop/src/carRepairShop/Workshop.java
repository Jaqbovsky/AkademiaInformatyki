package carRepairShop;

import java.util.ArrayList;
import java.util.List;


public class Workshop {

	public static List<Invoice> init(){

		Part p1 = new Part("Rims", 123456, 100.0);
		Part p2 = new Part("Grille ", 112233, 299.99);
		Part p3 = new Part("Door", 665544, 698.98);
		Part p4 = new Part("Door handle", 551133, 115.0);
		Part p5 = new Part("Wheel", 111666, 212.0);
		
		List<Part> parts1 = new ArrayList<Part>();
		parts1.add(p1);
		parts1.add(p5);
		
		List<Part> parts2 = new ArrayList<Part>();
		parts2.add(p4);
		parts2.add(p3);
		
		List<Part> parts3 = new ArrayList<Part>();
		parts3.add(p2);
		parts3.add(p5);
		
		Invoice i1 = new Invoice("06/07/2020", 123456, parts1);
		Invoice i2 = new Invoice("05/06/2020", 112233, parts2);
		Invoice i3 = new Invoice("04/05/2020", 998661, parts3);
		
		List<Invoice> invoices = new ArrayList<Invoice>();
		invoices.add(i1);
		invoices.add(i2);
		invoices.add(i3);
		
		return invoices;
	}

	public void listAll(List<Invoice> invoices) {
		
		System.out.println("-----------------------------------------------------------------");
		
		for (Invoice invoice : invoices) {
			
			System.out.println("Invoice number: " + invoice.getNumber());
			System.out.println("Date: " + invoice.getDate() );
			System.out.println("Parts: ");
			List<Part> parts = invoice.getParts();
			for(Part part : parts) {
				System.out.print("Name: " + part.getName() + "\tSeries: " + part.getSeries() + "\tPrice: " + part.getPrice() + " \n");
			}
			System.out.println();
			
		}
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void findPart(List<Invoice> invoices, String myPart) {
		
		for (Invoice invoice : invoices) {
		
			List<Part> parts = invoice.getParts();
			boolean contains = false;

			for(Part part : parts) {
				
				if (part.getName().equals(myPart)) {
					contains = true;
				}
				
			}
			
			if(contains == true) {
				System.out.println("Invoice number: " + invoice.getNumber());
				System.out.println("Date: " + invoice.getDate() );
				System.out.println("Parts: ");
				for(Part part2 : parts) {
					System.out.print("Name: " + part2.getName() + "\tSeries: " + part2.getSeries() + "\tPrice: " + part2.getPrice() + " \n");
				}
				System.out.println();
			}
			
		}
		System.out.println("-----------------------------------------------------------------");
	}

	public void sumAll(List<Invoice> invoices) {
		
		double sum = 0;
		
		for (Invoice invoice : invoices) {

			List<Part> parts = invoice.getParts();
			for(Part part : parts) {
				sum += part.getPrice();
			}
			
		}
		System.out.println("Value of all invoices: " + sum);
		
	}
	
}
