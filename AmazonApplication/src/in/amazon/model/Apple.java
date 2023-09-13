package in.amazon.model;

import java.util.ArrayList;

public class Apple extends Item {
	public ArrayList<Item> getApple() {
		ArrayList<Item> a=new ArrayList<>();
		Item s1 = new Apple();
		s1.setName("iPhone 14");
		s1.setId(300);
		s1.setPrice(66499);
		s1.setDiscount(5000);
		Item s2=new Apple();
		s2.setName("iPhone 15");
		s2.setId(301);
		s2.setPrice(120000);
		s2.setDiscount(2000);
		a.add(s1);
		a.add(s2);
		return a;
		
	}
}
