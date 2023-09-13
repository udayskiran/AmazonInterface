package in.amazon.dao.impl;

import java.util.ArrayList;

import in.amazon.model.AC;
import in.amazon.model.TV;

public class ElectronicsImpl {

	public ArrayList<ElectronicsImpl> getElectronics() {
		ArrayList electronics = new ArrayList();
		AC ac= new AC();
		ArrayList<AC> e1=ac.getAC();
		TV tv = new TV();
		ArrayList<TV> e2=tv.getTV();
		electronics.add(e1);
		electronics.add(e2);
		return electronics;
	}
}
