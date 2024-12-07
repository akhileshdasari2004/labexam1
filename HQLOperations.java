package HQLDemo;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;


public class HQLOperations {
 private static final Object Department = null;



public static void main(String args[])
 {
	 HQLOperations operations = new HQLOperations();
	 operations.addProduct();


//	 operations.deletepositionalparams();
//	 operations.deletenamedparams();

	 
 }

 
 	public void addProduct() 
 	{
 		Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction t =  session.beginTransaction();
        
        Department  department = new Department ();
        department.setId(1);
        department.setHodname("akhilesh");
        department.setLocation("vijayawada");
        department.setName("suryakiran");
         // please set stock status based on stock value
       
        
        session.persist(Department);
        t.commit();
        System.out.println("data added successfully");
        session.close();
        sf.close();
	}
 	
 	
 
 	public void deletepositionalparams()
 	{
 		Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID to Delete = ");
        int pid = sc.nextInt();

        MutationQuery query =   session.createMutationQuery("delete from id where id=?1 ");
 		query.setParameter(1, pid);
 		
 		int n =	query.executeUpdate(); //necessary to update this in the database
 		t.commit();
 		if(n>0) {
 		System.out.println(n+ "Id Deleted Successfully !");
 		}
 		else
 		{
 			System.out.println("id not found ");
 		}
 		sc.close();
 		session.close();
 		sf.close();
 	}
}
 	