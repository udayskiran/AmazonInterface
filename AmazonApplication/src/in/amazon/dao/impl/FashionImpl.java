package in.amazon.dao.impl;

import java.util.ArrayList;

import in.amazon.model.Men;
import in.amazon.model.Women;

public class FashionImpl {
	public ArrayList<FashionImpl> getFashion() {
		ArrayList list = new ArrayList();
		Men men = new Men();
		ArrayList<Men> f1=men.getMens();
		Women women = new Women();
		ArrayList<Women> f2=women.getWomenWear();
		list.add(f1);
		list.add(f2);
		return list;
		
	}
}
