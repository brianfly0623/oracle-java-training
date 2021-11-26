package duke.choice;

public class ShopApp {
	public static void main(String[] args) {
		
		double tax = 0.2;
		double total = 0;
		int measurement = 3;
		
		Customer c1 = new Customer();
		
		c1.name = "Pinky";
		c1.size = "S";
		System.out.println("Customer is " + c1.name);
		
		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();
		
		Clothing[] items = {item1, item2, new Clothing(), new Clothing()};
		
		item1.description = "Blue jacket";
		item1.price = 20.9;
		
		item2.description = "Orange T-Shirt";
		item2.price = 10.5;
		item2.size = "S";
		
		items[2].description = "Green Scarf";
		items[2].price = 5.0;
		items[2].size = "S";
		
		items[3].description = "Blue T-Shirt";
		items[3].price = 5.0;
		items[3].size = "S";
		
//		System.out.println("First item: " + item1.description + ", " + item1.price + " dolars and size " + item1.size);
//		System.out.println("Second item: " + item2.description + ", " + item2.price + " dolars and size " + item2.size);
		
		//total = (item1.price + item2.price + item2.price) * (1 + tax);
		System.out.println("The total is " + total);
		
		
		switch (measurement) {
		case 1, 2, 3:
			c1.size = "S";
			break;
		case 4, 5, 6:
			c1.size = "M";
			break;
		case 7, 8, 9:
			c1.size = "L";
		default:
			c1.size = "X";
		}
		
		//	      \/ var.	\/ nome q está no Array Clothing
		for (Clothing item : items) {
			if (c1.size.equals(item.size)) {
				total += item.price;
				System.out.println("Item: " + item.description + ", " + item.price + " dolars and size " + item.size);
				if (total > 15 ) {
					break;
				}
			}
		}

		System.out.println("Total = " + total);
		
		Clothing jacket = new Clothing();
		jacket.measure(12);
		String size = jacket.getSize();
		System.out.println(jacket.getSize());
		
	}
}
