package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Que1 

{
	static Scanner scan=new Scanner(System.in);
	
	
	public static String generateId(String name,String MblNo,String email) {
		
	StringBuilder builder=new StringBuilder();
	builder.append(name.substring(0,3));
	builder.append(MblNo.substring(7,10));
	builder.append(email.substring(0,3));
	return builder.toString();
	 
	
		
	}
	
	
	//---------------------------------Email validation Method-----------------------

	public static String emailValid(String str) {
		//String emailRegex = "^[\\w!#$%&'+/=?`{|}~^-]+(?:\\.[\\w!#$%&'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[\\a-zA-Z]{2,6}";
		String emailRegex = "^(.+)@(.+)$";
		Pattern pat = Pattern.compile(emailRegex);
		boolean val;
		if (str == null) {

			val = false;
		} else {

			val = pat.matcher(str).matches();
		}

		if (val == true) {
			return str;

		} else {
			return "Invalid";

		}

	}
	
	
	//-------------------------------------------------------------------------------------
	public static String mblNoValid(String str) {
		//String emailRegex = "^[\\w!#$%&'+/=?`{|}~^-]+(?:\\.[\\w!#$%&'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[\\a-zA-Z]{2,6}";
		String mblNoRegex = "(0/9)?[6-9][0-9]{9}";
		Pattern pat = Pattern.compile(mblNoRegex);
		boolean val;
		if (str == null) {

			val = false;
		} else {

			val = pat.matcher(str).matches();
		}

		if (val == true) {
			return str;

		} else {
			return "Invalid";

		}

	}

	

	
//---------------------------------------------------------------------
public static Connection getConnection() throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","santhanam");
   return con;
}


//------------------------ADD  DATA---------------------------------------------

public static void insertData() throws SQLException {
	PreparedStatement pre=getConnection().prepareStatement("insert into student values(?,?,?,?,?,?)");
	String name,emailId,mblNo;
	char ch;
	
	do{
	System.out.println("Enter RollNo: ");
	pre.setInt(1, scan.nextInt());
	scan.nextLine();
	System.out.println("Enter Name: ");
	name=scan.next();
	pre.setString(2, name);
	System.out.println("Enter MblNo: ");
	mblNo=scan.next();
	  
		String st=mblNoValid(mblNo);
	           
	            while(st=="Invalid") {
	        	   System.out.println("Invalid  Mobile Number!!!! enter Again");
	        	   mblNo=scan.next();
	        	   st=mblNoValid(mblNo);
	             }
	
	
	pre.setString(3,mblNo );
	System.out.println("Enter City: ");
	pre.setString(4, scan.next());
	System.out.println("Enter Email: ");
	//---------------------------------------Email------------------------
    emailId=scan.next();
	String st1=emailValid(emailId);
           
            while(st1=="Invalid") {
        	   System.out.println("Invalid Email Id!!!! enter Again");
        	   emailId=scan.next();
        	   st1=emailValid(emailId);
             }
           
           
	            pre.setString(5,emailId);
	            
	            
           
           
  //------------------------------------------------------------------------
	System.out.println("Enter Standard: ");
	pre.setString(6, scan.next());
	int res=pre.executeUpdate();
	if(res>0) {
	 String id= generateId(name,mblNo,emailId);
	 
		System.out.println("Add succsessfully...your transaction Id :" +id);
	}
	
	PreparedStatement pr=getConnection().prepareStatement("Select*from student");
	ResultSet rs=pr.executeQuery();
	while(rs.next())
	{
		System.out.println("RollNo: "+rs.getInt(1)+ " Name: "+rs.getString(2)+ " MblNo: "+rs.getString(3)+ " City: "+rs.getString(4)+" Email: "+rs.getString(5)+" Standard: "+rs.getString(6));	
	}
	
	System.out.println("Add More press Y or y ");
	ch=scan.next().charAt(0);
	
	}while(ch=='y'||ch=='Y');
	
}
	
//------------------------------Display-----------------------------

public static void display() throws SQLException {
	
	PreparedStatement pr=getConnection().prepareStatement("Select*from student");
	ResultSet rs=pr.executeQuery();
	System.out.println("--------------------------------------------------");
	while(rs.next())
	{
		System.out.println("RollNo: "+rs.getInt(1)+ " Name: "+rs.getString(2)+ " MblNo: "+rs.getString(3)+ " City: "+rs.getString(4)+" Email: "+rs.getString(5)+" Standard: "+rs.getString(6));	
	}
	
	System.out.println("--------------------------------------------------");
	System.out.println("Display Successfully");
	
	
	
}

//------------------------Update-----------------------------------------


public static void update() throws SQLException {
	
  PreparedStatement pre=Que1.getConnection().prepareStatement("update student set name=?,city=? where RollNo=?");
  System.out.println("Enter New Name:");
	pre.setString(1, scan.next());
	System.out.println("Enter New City Name:");
	pre.setString(2, scan.next());
	System.out.println("To which -Roll No- it should change:");
	pre.setInt(3, scan.nextInt());
	int res = pre.executeUpdate();
	if (res >= 1) {
		System.out.println("Updated Successfully");
	}
	System.out.println("----------------------------------");

	
	ResultSet rs = pre.executeQuery("select *from student");
	while(rs.next()) {
		System.out.println("RollNo: "+rs.getInt(1)+ " Name: "+rs.getString(2)+ " MblNo: "+rs.getString(3)+ " City: "+rs.getString(4)+" Email: "+rs.getString(5)+" Standard: "+rs.getString(6));
	}
	System.out.println("----------------------------------");

}
	
//-------------------DeleteData-------------------------------

public static void delete() throws SQLException {
	PreparedStatement prp=Que1.getConnection().prepareStatement("delete from student where rollNo=?");
	System.out.println("Enter Roll No:");
	prp.setInt(1, scan.nextInt());
	System.out.println("Are you sure you want(Y/N)");
	char res= scan.next().charAt(0);
	if(res == 'Y'||res=='y') {
	prp.executeUpdate();	
	System.out.println("Deleted Successfully");
	}
	System.out.println("----------------------------------");
   ResultSet rs = prp.executeQuery("select *from student");
	while(rs.next()) {
		System.out.println("RollNo: "+rs.getInt(1)+ " Name: "+rs.getString(2)+ " MblNo: "+rs.getString(3)+ " City: "+rs.getString(4)+" Email: "+rs.getString(5)+" Standard: "+rs.getString(6));
	}
	System.out.println("----------------------------------");

}
	
//-------------------------------------Search data-----------------------------------

public static void Search() throws SQLException
{
	PreparedStatement prp1=Que1.getConnection().prepareStatement("select*from student where rollno=?;");
	PreparedStatement prp2=Que1.getConnection().prepareStatement("select*from student where name=?;");
	PreparedStatement prp3=Que1.getConnection().prepareStatement("select*from student where city=?;");
	PreparedStatement prp4=Que1.getConnection().prepareStatement("select*from student where  Standard=?;");
	
	System.out.println("1-SearchBy rollNo \n 2-searchBy Name \n 3-searchBy city \n 4-SearchBy Standard \n5-Back to mainManu ");
	
	int val=scan.nextInt();
	switch(val) {
	case 1:
	{
		
		System.out.println("Enter Roll No:");		
		prp1.setInt(1, scan.nextInt());			
		ResultSet rs = prp1.executeQuery();		
		System.out.println("----------------------------------");		
		while(rs.next()) {			
			System.out.println("RollNo: "+rs.getInt(1)+ " Name: "+rs.getString(2)+ " MblNo: "+rs.getString(3)+
				
					" City: "+rs.getString(4)+" Email: "+rs.getString(5)+" Standard: "+rs.getString(6));
		}
			System.out.println("----------------------------------");
	}	
	    break;
	case 2:
		System.out.println("Enter Name:");
		prp2.setString(1, scan.next());	
		ResultSet rs1 = prp2.executeQuery();
		System.out.println("----------------------------------");
		while(rs1.next()) {
			System.out.println("RollNo: "+rs1.getInt(1)+ " Name: "+rs1.getString(2)+ " MblNo: "+rs1.getString(3)+
					" City: "+rs1.getString(4)+" Email: "+rs1.getString(5)+" Standard: "+rs1.getString(6));
			}	
		System.out.println("----------------------------------");
	break;
	case 3:{
		System.out.println("Enter City Name:");		
		prp3.setString(1, scan.next());			
		ResultSet rs3 = prp3.executeQuery();		
		System.out.println("----------------------------------");		
		while(rs3.next()) {			
			System.out.println("RollNo: "+rs3.getInt(1)+ " Name: "+rs3.getString(2)+ " MblNo: "+rs3.getString(3)+
					
					" City: "+rs3.getString(4)+" Email: "+rs3.getString(5)+" Standard: "+rs3.getString(6));
		}
			System.out.println("----------------------------------");
	}
          break;	

	
	case 4:
	{
		System.out.println("Enter Standard:");
		prp4.setString(1, scan.next());	
		ResultSet rs2 = prp4.executeQuery();
		System.out.println("----------------------------------");
		while(rs2.next()) {
			System.out.println("RollNo: "+rs2.getInt(1)+ " Name: "+rs2.getString(2)+ " MblNo: "+rs2.getString(3)+
					" City: "+rs2.getString(4)+" Email: "+rs2.getString(5)+" Standard: "+rs2.getString(6));
			}	
		System.out.println("----------------------------------");
	}
	break;
         
	case 5:
		Que1.mainMenu();
		default:
			System.out.println("Invalid!!!");
			Que1.Search();
		      
	}
		
}
	
	
	public static void mainMenu() {
		
		System.out.println("-------------MainMenu--------------------");
		System.out.println("1-Add");
		System.out.println("2-Display");
		System.out.println("3-Update");
		System.out.println("4-Delete");
		System.out.println("5-Search Data");
		System.out.println("6-Exit");
		
		System.out.println("-------------MainMenu--------------------");
	}
	
	
	
	
	
	
	public static void main(String[] args) throws SQLException {
	
		int option;
		do {
			Que1.mainMenu();
			System.out.println("Enter the Choice:");
			option = scan.nextInt();
			switch (option) {
			//method calling
			case 1:
				 insertData();
				break;
			case 2:
				display();
				break;
			case 3:
				update();
				break;
			case 4:
			    delete();
				break;
			case 5:
				Search();
				break;

			case 6:		
			    System.out.println("Exited Sucessfully");
			    System.exit(7);
				break;
			}	
		}while (option > 0 && option <= 6);		
			System.out.println("You hvae entered wrong option....");
		
		}

}
