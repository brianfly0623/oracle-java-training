package duke.choice;

public class ShopApp {
	public static void main(String[] args) {
		
		double tax = 0.2;
		double total;
		
		Customer c1 = new Customer();
		
		c1.name = "Pinky";
		System.out.println("Customer is " + c1.name);
		
		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();
		
		item1.description = "Blue jacket";
		item1.price = 20.9;
		
		item2.description = "Orange T-Shirt";
		item2.price = 10.5;
		item2.size = "S";
		
		System.out.println("First item: " + item1.description + ", " + item1.price + " dolars and size " + item1.size);
		System.out.println("Second item: " + item2.description + ", " + item2.price + " dolars and size " + item2.size);
		
		total = (item1.price + item2.price + item2.price) * (1 + tax);
		System.out.println("The total is " + total);
	}
}
