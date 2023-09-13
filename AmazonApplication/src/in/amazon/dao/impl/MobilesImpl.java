package in.amazon.dao.impl;

import java.util.ArrayList;

import in.amazon.model.Apple;
import in.amazon.model.Item;
import in.amazon.model.Oneplus;
import in.amazon.model.Samsung;

public class MobilesImpl {
	public ArrayList<MobilesImpl> getMobiles() {
		ArrayList mobiles = new ArrayList();
		Oneplus oneplus = new Oneplus();
		ArrayList<Item> m1 = oneplus.getOneplus();
		Samsung samsung = new Samsung();
		ArrayList<Item> m2 = samsung.getSamsung();
		Apple apple = new Apple();
		ArrayList<Item> m3 = apple.getApple();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		return mobiles;
	}
}
