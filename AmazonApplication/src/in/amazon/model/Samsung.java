package in.amazon.model;

import java.util.ArrayList;

public class Samsung extends Item{
	public ArrayList<Item> getSamsung() {
		ArrayList<Item> s=new ArrayList<>();
		Item s1 = new Samsung();
		s1.setName("Samsung Galaxy M34 Gg");
		s1.setId(200);
		s1.setPrice(19999);
		s1.setDiscount(1500);
		Item s2=new Samsung();
		s2.setName("Samsung Galaxy M14 5G");
		s2.setId(201);
		s2.setPrice(14990);
		s2.setDiscount(1100);
		s.add(s1);
		s.add(s2);
		return s;
	}
}
