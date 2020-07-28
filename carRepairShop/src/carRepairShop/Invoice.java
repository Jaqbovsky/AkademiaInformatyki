package carRepairShop;

import java.util.Date;
import java.util.List;

public class Invoice {
	private String date;
	private int number;
	private List<Part> parts;
	public Invoice(String date, int number, List<Part> parts) {
		super();
		this.date = date;
		this.number = number;
		this.parts = parts;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public List<Part> getParts() {
		return parts;
	}
	public void setParts(List<Part> parts) {
		this.parts = parts;
	}

	

}
