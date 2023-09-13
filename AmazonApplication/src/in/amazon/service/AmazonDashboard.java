package in.amazon.service;

import java.util.ArrayList;
import java.util.List;

import in.amazon.dao.impl.ElectronicsImpl;
import in.amazon.dao.impl.FashionImpl;
import in.amazon.dao.impl.MobilesImpl;

public class AmazonDashboard {
	public ArrayList<List> getDashboardService(){
		ArrayList<List> list=new ArrayList();
		MobilesImpl m = new MobilesImpl();
		ArrayList<MobilesImpl> mobilesImpl=m.getMobiles();
		list.add(mobilesImpl);
		ElectronicsImpl e = new ElectronicsImpl();
		ArrayList<ElectronicsImpl> ElectronicsImpl=e.getElectronics();
		list.add(ElectronicsImpl);
		FashionImpl f = new FashionImpl();
		ArrayList<FashionImpl> FashionImpl=f.getFashion();
		list.add(FashionImpl);
		return list;
	}
	
}
