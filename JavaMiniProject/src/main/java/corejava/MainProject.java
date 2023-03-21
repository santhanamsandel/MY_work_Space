package corejava;

import java.util.Scanner;



public class MainProject {
	Scanner ip = new Scanner(System.in);
	static MainProject obj = new MainProject();
//-------------------------------------------------------Main manu------------------------------------------
	void startMain() {

		System.out.println("*****************************************************************************************");
		System.out.println(
				"!!!------------------------------Welcome to Best Choice Market-------------------------------!!!");
		System.out.println("*****************************************************************************************");
		System.out.println(" If you want see our list of items please type 1");
		int sc = ip.nextInt();
		if (sc == 1) {
			obj.mainManu();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.startMain();
		}

	}

	public void mainManu() {
		System.out.println();
		System.out.println(" 1) Fruits");
		System.out.println(" 2) Vegetables");
		System.out.println(" 3) Cosmetics");
		System.out.println(" 4) Masala Powders");
		System.out.println(" 5) Exit");
		System.out.println("*****************************************************************************************");
		System.out.println(" Please choose your option: ");
		int option = ip.nextInt();
		obj.meth2(option);
	}

	
	void meth2(int option) {
		if (option <= 5) {
			System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
			int yes = ip.nextInt();
			if (yes == 1) {
				obj.meth3(option);
			} else if (yes == 2) {
				obj.mainManu();
			} else {
				System.out.println();
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option either 1 or 2 !!!");
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth2(option);
			}
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.mainManu();
		}
	}

	void meth3(int option) {
		switch (option) {
		case 1:
			System.out.println();
			System.out.println(" 101  Mango----->1kg------->RS.205");
			System.out.println(" 102  Apple----->1kg------->RS.250");
			System.out.println(" 103  Greps----->1kg------->RS.116");
			System.out.println(" 104  Guva------>1kg------->RS.99");
			System.out.println(
					"*****************************************************************************************");
			System.out.println(" Please choose your product code: ");
			int fcode = ip.nextInt();
			if (fcode == 101) {
				Products.Mango(option);
			} else if (fcode == 102) {
				Products.Apple(option);
			} else if (fcode == 103) {
				Products.Greps(option);
			} else if (fcode == 104) {
				Products.Guva(option);
			} else {
				System.out.println();
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 2:
			System.out.println();
			System.out.println(" 201  Tomato----------->1kg------->RS.30");
			System.out.println(" 202  Green Chilli----->1kg------->RS.25");
			System.out.println(" 203  Potato----------->1kg------->RS.49");
			System.out.println(" 204  Cucumber--------->1kg------->RS.35");
			System.out.println(
					"*****************************************************************************************");
			System.out.println(" Please choose your product code: ");
			int vcode = ip.nextInt();
			if (vcode == 201) {
				Products.Tomato(option);
			} else if (vcode == 202) {
				Products.Green_Chilli(option);

			} else if (vcode == 203) {
				Products.Potato(option);
			} else if (vcode == 204) {
				Products.Cucumber(option);
			} else {
				System.out.println();
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 3:
			System.out.println();
			System.out.println(" 301  Kajal----------->1------->RS.10");
			System.out.println(" 302  Lip Stick------->1------->RS.20");
			System.out.println(" 303  Nail Polish----->1------->RS.50");
			System.out.println(" 304  Face Powder----->1------->RS.120");
			System.out.println(
					"*****************************************************************************************");
			System.out.println(" Please choose your product code: ");
			int Ccode = ip.nextInt();
			if (Ccode == 301) {
				Products.Kajal(option);
			} else if (Ccode == 302) {
				Products.Lip_Stick(option);

			} else if (Ccode == 303) {
				Products.Nail_Poslish(option);
			} else if (Ccode == 304) {
				Products.Face_Powder(option);
			} else {
				System.out.println();
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 4:
			System.out.println();
			System.out.println(" 401  Chilli Powder--------->1------->RS.69");
			System.out.println(" 402  Turmeric Powder------->1------->RS.85");
			System.out.println(" 403  Coriander Powder------>1------->RS.90");
			System.out.println(" 404  Pepper Powder--------->1------->RS.110");
			System.out.println(
					"*****************************************************************************************");
			System.out.println(" Please choose your product code: ");
			int Mcode = ip.nextInt();
			if (Mcode == 401) {
				Products.Chilli_Powder(option);
			} else if (Mcode == 402) {
				Products.Turmeric_Powder(option);

			} else if (Mcode == 403) {
				Products.Coriander_Powder(option);
			} else if (Mcode == 404) {
				Products.Pepper_Powder(option);
			} else {
				System.out.println();
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 5:
//			totalbill = 0.0;
			System.out.println();
			System.out.println(" Successfully Exited");
			System.out.println(
					"#########################################################################################");
			System.out.println();
			System.out.println();
			obj.startMain();
		}
	}

	void meth5() {
		System.out.println("If yes press 1 or else press 2");
		int press = ip.nextInt();
		if (press == 1)
			obj.mainManu();
		else if (press == 2) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(
					"#########################################################################################");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(
					"<<<<<<<<<<,,,,,,,,,,,,,,,,,,,,Once again THANK YOU for Shopping,,,,,,,,,,,,,,,,,>>>>>>>>>");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(
					"#########################################################################################");
			System.out.println();
			System.out.println();
			System.out.println();
		} else {
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.meth5();
		}
		ip.close();
	}

	public static void main(String[] args) {

		obj.startMain();
	}


}
