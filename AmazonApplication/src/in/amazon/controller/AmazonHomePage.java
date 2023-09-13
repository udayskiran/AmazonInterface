package in.amazon.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import in.amazon.dao.impl.ElectronicsImpl;
import in.amazon.dao.impl.FashionImpl;
import in.amazon.dao.impl.MobilesImpl;
import in.amazon.service.AmazonDashboard;

public class AmazonHomePage {

	public static void main(String[] args) {
		AmazonDashboard amazonDashboard = new AmazonDashboard();
		ArrayList<List> AllList=amazonDashboard.getDashboardService();
		Scanner s=new Scanner(System.in);
		System.out.println("===========================================================================================================");
		System.out.println("");
		System.out.println("                 ||__AMAZING DEALS >< WELCOME TO AMAZON SHOPPPING >< EXCITING OFFERS__||");
		
		System.out.println("===========================================================================================================");
		System.out.println("[ 1.Mobile Phones ]      ||      [ 2.Electronics ]      ||      [ 3.Fashion ]      ||      [ 4.All Deals ]");
		System.out.println("===========================================================================================================");
		int n=s.nextInt();
		switch(n) {
		case 1:
			
			MobilesImpl mobilesImpl = new MobilesImpl();
			ArrayList<MobilesImpl> m=mobilesImpl.getMobiles();
			System.out.println("   1.One Plus Mobiles");
			System.out.println("   2.Samsung Mobiles");
			System.out.println("   3.Apple Mobiles");
			System.out.println("   4.All Brand's");
			int select=s.nextInt();
			switch(select) {
			case 1:
				System.out.println(m.get(0));
				break;
			case 2:
				System.out.println(m.get(1));
				break;
			case 3:
				System.out.println(m.get(2));
				break;
			case 4:
				System.out.println(AllList.get(0));
				break;
			default:
				System.out.println("Invalid..");
				
			}
			
			break;
		case 2:
			ElectronicsImpl electronicsImpl = new ElectronicsImpl();
			ArrayList<ElectronicsImpl> e=electronicsImpl.getElectronics();
			System.out.println("                                    1.A.C's");
			System.out.println("                                    2.T.V's");
			System.out.println("                                    3.All Item's");
			int sel=s.nextInt();
			switch(sel) {
			case 1:
				System.out.println(e.get(0));
				break;
			case 2:
				System.out.println(e.get(1));
				break;
			case 3:
				System.out.println(AllList.get(1));
				break;
			default:
				System.out.println("Invalid..");
			}
			break;
		case 3:
			FashionImpl fashionImpl = new FashionImpl();
			ArrayList<FashionImpl> f=fashionImpl.getFashion();
			System.out.println("                                                                   1.Mens Wear ");
			System.out.println("                                                                   2.Womens Wear");
			System.out.println("                                                                   3.All Item's");
			int option=s.nextInt();
			switch(option) {
			case 1:
				System.out.println(f.get(0));
				break;
			case 2:
				System.out.println(f.get(1));
				break;
			case 3:
				System.out.println(AllList.get(2));
				break;
			default:
				System.out.println("Invalid");
			}
			
			break;
		case 4:
			System.out.println(AllList);
			break;
		}
		
		

	}

}
