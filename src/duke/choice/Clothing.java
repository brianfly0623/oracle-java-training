package duke.choice;

public class Clothing {

	String description;
	private double price;
	private String size;
		
	private final double MIN_PRICE = 10.0;
	private final double MIN_TAX = .2;

	public void measure(int value) {
		size = (value < 10) ? "S" : "M";
	}
	
	public String getDescription() {
		return description;
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price * (1 + MIN_TAX);
	}
	
	public void setPrice(double price) {
		this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	
}
