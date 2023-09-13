package in.amazon.model;

import java.util.ArrayList;

public class Men extends Item{
	public ArrayList<Men> getMens() {
		ArrayList list = new ArrayList();
		
		Item men1 = new Men();
		men1.setId(1);
		men1.setName("Allen Solly Men's Reggular T-shirt");
		men1.setPrice(929);
		men1.setDiscount(200);
		Item men2 = new Men();
		men2.setId(2);
		men2.setName("Levi's Mens's MidRise Slim Fit Jeans");
		men2.setPrice(1279);
		men2.setDiscount(350);
		Item men3 = new Men();
		men3.setId(3);
		men3.setName("Levi's Men Shirt");
		men3.setPrice(600);
		men3.setDiscount(100);
		list.add(men1);
		list.add(men2);
		list.add(men3);
		
		return list;
		
	}
}
