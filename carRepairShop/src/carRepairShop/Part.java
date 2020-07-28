package carRepairShop;

public class Part {
	private String name;
	private int series;
	private double price;
	
	public Part(String name, int series, double price) {
		super();
		this.name = name;
		this.series = series;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
