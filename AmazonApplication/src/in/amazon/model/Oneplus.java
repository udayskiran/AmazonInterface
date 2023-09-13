package in.amazon.model;

import java.util.ArrayList;
public class Oneplus extends Item{
	public ArrayList<Item> getOneplus() {
		ArrayList<Item> o=new ArrayList<>();
		Item s1 = new Oneplus();
		s1.setName("Oneplus Nord CE 3 5G");
		s1.setId(100);
		s1.setPrice(25000);
		s1.setDiscount(1500);
		Item s2=new Oneplus();
		s2.setName("Oneplus 11 5G");
		s2.setId(101);
		s2.setPrice(19999);
		s2.setDiscount(1100);
		o.add(s1);
		o.add(s2);
		return o;
	}
}
