package duke.choice;

public class Clothing {

	String description;
	private double price;
	private String size;
		
	public final static double MIN_PRICE = 10.0;
	public final static double TAX_RATE = .2;
	
	public Clothing(String description, double price, String aSize) {
		this.description = description;
		this.price = price;
		size = aSize;
	}

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
		return price * (1 + TAX_RATE);
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
