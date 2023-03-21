package corejava;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;



public class BillGen {
	static ArrayList<String> PName = new ArrayList<String>();
	static ArrayList<String> PCode = new ArrayList<String>();
	static ArrayList<Double> Price = new ArrayList<Double>();
	static ArrayList<Integer> Quantity = new ArrayList<Integer>();
	static ArrayList<Double> Total_Price = new ArrayList<Double>();
	static double totalbill = 0.0;
	static Scanner ip = new Scanner(System.in);
	static MainProject obj = new MainProject();
	static BillGen obj1 = new BillGen();

	void com_method(double total, String PN, String PC, double P, int Q) {
		System.out.println(" press 1 for continue shopping");
		System.out.println(" press 2 for stop here and get bill");
		System.out.println(" Press 3 for Exit");
		int press = ip.nextInt();
		if (press == 1) {
			totalbill = totalbill + total;
			obj1.callall(PN, PC, P, Q, total);
			obj.mainManu();
		} else if (press == 2) {
			totalbill = totalbill + total;
			obj1.callall(PN, PC, P, Q, total);
			
			System.out.print(" Enter your Name: ");
			ip.nextLine();
			String name = ip.nextLine();
			System.out.print(" Enter your Address: ");
			String add = ip.nextLine();
			String ph = "";
			int i = 1;
			while (i == 1) {
				System.out.print(" Enter your Contact No: ");
				String phone = ip.next();
				if (phone.length() == 10) {
					ph = ph + phone;
					i = 0;
				} else {
					System.out.println(" Please check and enter valid number");
					i = 1;

				}
				System.out.println();
			}
			try {
				DataBase.cust_detail(name,add ,ph);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("no");
			}
			BillGen.meth4(name, add, ph);
			
		} else if (press == 3) {
			System.out.println();
			obj.meth3(5);
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			obj1.com_method(total, PN, PC, P, Q);
		}
	}

	double bill(double totalbill) {
		double dis = 0.0;
		if (totalbill >= 1000) {
			dis = 0.05 * totalbill;
		}
		return dis;
	}

	public static void meth4(String name, String add, String phone) {
		System.out.println("*****************************************************************************************");
		System.out.println(
				"!!!------------------------------Welcome to Best Choice Market-------------------------------!!!");
		System.out.println("*****************************************************************************************");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(" S.No	 Product Name    	   Product Code       Quantity	    Price     Total Price");
		System.out.println(" ====	 =============    	   ============       ========      ======    ===========");
		for (int i = 0; i < PName.size(); i++) {
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println("  " + (i + 1) + "   	  " + PName.get(i) + "              " + PCode.get(i)
					+ "		 " + Quantity.get(i) + "	     " + Price.get(i) + "    	  " + Total_Price.get(i));
			System.out.println(
					"-----------------------------------------------------------------------------------------");
		}
		System.out.println();
		System.out.println(" Total bill of purchased items:  " + totalbill);
		double discount = obj1.bill(totalbill);
		if (discount > 0.0)
			System.out.println(" Hey " + name + " congtrats !!! you received a discount of 5%: " + discount);

		System.out.println(" Sorry " + name + " you are not received any discount...");
		System.out.println(" Your final final bill: " + (totalbill - discount));
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<---Thank you for shopping--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("*****************************************************************************************");
		System.out.println("Customer details:");
		System.out.println("----------------");
		System.out.println(" Name: " + name);
		System.out.println(" Address: " + add);
		System.out.println(" Phone: " + phone);
		System.out.println();
		System.out.println("*****************************************************************************************");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("<<<<<-------------------**** IF YOU WANT TO DO SHOPPING AGAIN ****---------------->>>>>>>");
		System.out.println("-----------------------------------------------------------------------------------------");
		obj.meth5();
	}

	void callall(String PN, String PC, double P, int Q, double total) {
		PName.add(PN);
		PCode.add(PC);
		Price.add(P);
		Quantity.add(Q);
		Total_Price.add(total);
	}

	
	
	
	
}
