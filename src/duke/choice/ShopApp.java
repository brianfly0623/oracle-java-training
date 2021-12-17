package duke.choice;

public class ShopApp {
	public static void main(String[] args) {
		
		double tax = 0.2;
		double total = 0;
		int measurement = 8;
		
		Customer c1 = new Customer("Pinky", 14);
		
		//c1.setName("Pinky");
		//c1.setSize("S");
		
		System.out.println("Min Price is " + Clothing.MIN_PRICE);
		
		Clothing item1 = new Clothing("Blue jacket", 20.9, "M");
		Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
		
		Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5, "S"), new Clothing("Blue T-Shirt", 5, "S")};
		
//		System.out.println("First item: " + item1.description + ", " + item1.price + " dolars and size " + item1.size);
//		System.out.println("Second item: " + item2.description + ", " + item2.price + " dolars and size " + item2.size);
		
		//total = (item1.price + item2.price + item2.price) * (1 + tax);
//		System.out.println("The total is " + total);
		
		c1.addItems(items);
		c1.setSize(measurement);
		System.out.println("Customer is " + c1.getName() + ", " + c1.getSize());

		for (Clothing item : items) {
			
			System.out.println("Item " + ", " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
		}
		
		int average = 0;
		int count = 0;
		
		for (Clothing item : c1.getItems()) {
			if (item.getSize().equals("L")) {
				count++;
				average += item.getPrice();
			}
		}
		try {
			average = average / count;
			System.out.println("Average price " + average + ", Count " + count);
				
		} catch (ArithmeticException e) {
			System.out.println("Don't divide by 0");
		}
		
		
	}
}
