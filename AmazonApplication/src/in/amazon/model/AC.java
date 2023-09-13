package in.amazon.model;

import java.util.ArrayList;

public class AC extends Item{
	public ArrayList<AC> getAC() {
		ArrayList ele = new ArrayList();
		Item ac1=new AC();
		ac1.setId(123);
		ac1.setName("Blue Star");
		ac1.setPrice(35999);
		ac1.setDiscount(2000);
		Item ac2 = new AC();
		ac2.setId(124);
		ac2.setName("Panasonic");
		ac2.setPrice(45000);
		ac2.setDiscount(5000);
		ele.add(ac1);
		ele.add(ac2);
		return ele;
		
	}
}
