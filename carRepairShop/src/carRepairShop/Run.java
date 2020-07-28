package carRepairShop;

import java.util.List;

public class Run {

	public static void main(String[] args) {
		Workshop shop = new Workshop();
	    List<Invoice> invoices = Workshop.init();
	    
		shop.listAll(invoices);
		shop.findPart(invoices, "Door");
		shop.sumAll(invoices);
	}

}
