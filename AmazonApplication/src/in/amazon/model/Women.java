package in.amazon.model;

import java.util.ArrayList;

public class Women extends Item{
	public ArrayList<Women> getWomenWear() {
		ArrayList list = new ArrayList();
		Item women1 = new Women();
		women1.setId(10);
		women1.setName("Womens regggular Fit T-Shirt");
		women1.setPrice(699);
		women1.setDiscount(100);
		Item women2 = new Women();
		women2.setId(11);
		women2.setName("Women's printed Ready to Wear Saree");
		women2.setPrice(1199);
		women2.setDiscount(200);
		list.add(women1);
		list.add(women2);
		return list;
	}
}
