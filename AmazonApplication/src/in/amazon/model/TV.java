package in.amazon.model;

import java.util.ArrayList;

public class TV extends Item{
	public ArrayList<TV> getTV() {
		ArrayList ele2 = new ArrayList();
		Item tv1 = new TV();
		tv1.setId(150);
		tv1.setName("MI TV 32'inch ");
		tv1.setPrice(13999);;
		tv1.setDiscount(1500);
		Item tv2 = new TV();
		tv2.setId(151);
		tv2.setName("Sony TV 43'inch ");
		tv2.setPrice(28999);
		tv2.setDiscount(2500);
		ele2.add(tv1);
		ele2.add(tv2);
		return ele2;
	}
}
