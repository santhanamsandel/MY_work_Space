package corejava;

import java.util.Scanner;



public class Products {
	static Scanner ip = new Scanner(System.in);
	static MainProject obj = new MainProject();
	static BillGen obj1 = new BillGen();

//-------------------------------------------fruits-------------------------------------
//--------------------------------------------------------------------------------------	
	public static void Mango(int option) {
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Mango           ";
		String PC = "101";
		double P = 205;
		if (s == 1) {
			System.out.println(" Mango ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 205;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there ,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Mango(option);
		}
	}

	public static void Apple(int option) {
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Apple           ";
		String PC = "102";
		double P = 250;
		if (s == 1) {
			System.out.println(" Apple ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 250;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Apple(option);
		}
	}

	public static void Greps(int option) {
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Greps           ";
		String PC = "103";
		double P = 100;
		if (s == 1) {
			System.out.println(" Greps ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 116;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Greps(option);
		}
	}

	public static void Guva(int option) {
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Guva            ";
		String PC = "104";
		double P = 90;
		if (s == 1) {
			System.out.println(" Guva ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 99;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Guva(option);
		}
	}

//----------------------------------vegetables---------------------------------------

	public static void Tomato(int option) {
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Tomato          ";
		String PC = "201";
		double P = 30;
		if (s == 1) {
			System.out.println(" Tomato ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 30;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Tomato(option);
		}
	}

	public static void Green_Chilli(int option) {
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Green Chilli    ";
		String PC = "202";
		double P = 25;
		if (s == 1) {
			System.out.println(" Green Chilli ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 25;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Green_Chilli(option);
		}
	}

	public static void Potato(int option) {
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Potato          ";
		String PC = "203";
		double P = 49;
		if (s == 1) {
			System.out.println(" Potato ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 49;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Potato(option);
		}
	}

	public static void Cucumber(int option) {
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Cucumber     ";
		String PC = "204";
		double P = 35;
		if (s == 1) {
			System.out.println(" Cucumber ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 35;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Cucumber(option);
		}
	}

//-----------------------------------------cosmetics----------------------------

	public static void Kajal(int option) {
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Kajal           ";
		String PC = "301";
		double P = 10;
		if (s == 1) {
			System.out.println(" Kajal ===> How many do yo need?");
			int Q = ip.nextInt();
			double total = Q * 10;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Kajal(option);
		}
	}

	public static void Lip_Stick(int option) {
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Lip Stic        ";
		String PC = "302";
		double P = 20;
		if (s == 1) {
			System.out.println(" Lip_Stick ===> How many do yo need?");
			int Q = ip.nextInt();
			double total = Q * 20;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Lip_Stick(option);
		}
	}

	public static void Nail_Poslish(int option) {
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Nail Polish     ";
		String PC = "303";
		double P = 50;
		if (s == 1) {
			System.out.println(" Nail_Polish ===> How many do yo need?");
			int Q = ip.nextInt();
			double total = Q * 50;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Nail_Poslish(option);
		}
	}

	public static void Face_Powder(int option) {
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Face Powder     ";
		String PC = "304";
		double P = 120;
		if (s == 1) {
			System.out.println(" Face_Powder ===> How many do yo need?");
			int Q = ip.nextInt();
			double total = Q * 120;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Face_Powder(option);
		}
	}

	// --------------------------Masala powder-----------------------------------
	public static void Chilli_Powder(int option) {
		System.out.println("Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Chilli Powder   ";
		String PC = "401";
		double P = 69;
		if (s == 1) {
			System.out.println(" Chiili Powder ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 69;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Chilli_Powder(option);
		}
	}

	public static void Turmeric_Powder(int option) {
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Turmeric Powder ";
		String PC = "402";
		double P = 85;
		if (s == 1) {
			System.out.println(" Turmeric_Powder ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 85;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Turmeric_Powder(option);
		}
	}

	public static void Coriander_Powder(int option) {
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Coriander Powder";
		String PC = "403";
		double P = 90;
		if (s == 1) {
			System.out.println(" Coriander_Powder ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 90;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Coriander_Powder(option);
		}
	}

	public static void Pepper_Powder(int option) {
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s = ip.nextInt();
		String PN = "Pepper Powder   ";
		String PC = "404";
		double P = 110;
		if (s == 1) {
			System.out.println(" Pepper_Powder ===> How many kgs do yo need?");
			int Q = ip.nextInt();
			double total = Q * 110;
			obj1.com_method(total, PN, PC, P, Q);
		} else if (s == 2) {
			obj.meth3(option);
		} else if (s == 3) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			Products.Pepper_Powder(option);
		}
	}

}
