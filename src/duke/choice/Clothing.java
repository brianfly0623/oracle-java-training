package duke.choice;

public class Clothing {

		private String description;
		private double price;
		private String size;

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
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	
}
