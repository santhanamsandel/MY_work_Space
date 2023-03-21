package com.mavenhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	try{
		    
		    	
		    Configuration cfg=new Configuration();
		    cfg.configure("Hibernate.cfg.xml");  
		   SessionFactory factory=cfg.buildSessionFactory();  
		    //creating session object  
		    Session session=factory.openSession();  
		     //creating transaction object  
		    Transaction t=session.beginTransaction();  
//		    Employee emp=new Employee();
//		    emp.setEmpName("guru");
//		    emp.setEmpSalary(10000);
//		    Employee emp1=new Employee();
//		    emp1.setEmpName("vijay");
//		    emp1.setEmpSalary(15000);
//		    
//		    
//		    session.persist(emp);//persisting the object  
//		    session.persist(emp1);//persisting the object 
		    Employee emp=(Employee) session.get(Employee.class, 2);
		     System.out.println(emp);
		     Employee emp1=(Employee) session.get(Employee.class, 2);
		     System.out.println(emp1);
		    t.commit();//transaction is committed
		    
		  
		  session.close();
		  Session session1=factory.openSession();  
		     //creating transaction object  
		    Transaction t1=session1.beginTransaction();  
		  
		  
		  Employee emp2=(Employee) session1.get(Employee.class, 2);
		     System.out.println(emp2);
		      
		    System.out.println("successfully saved");  
		      }catch(Exception ex)
		      {
		    	  System.out.println("Problem in connection"+ex.getMessage());
		      }

    }
}
