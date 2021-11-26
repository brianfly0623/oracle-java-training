package duke.choice;

public class Clothing {
	String description;
	double price;
	String size;

	public void measure(int value) {
		size = (value < 10) ? "S" : "M";
	}
	public String getSize() {
		return size;
	}
}
