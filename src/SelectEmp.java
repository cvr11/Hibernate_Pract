import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectEmp {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx= s.beginTransaction();
		/*
		 * FOr selecting we can use two methods 
		 * one is if you must had a record at the time we can use load method (will be there)
		 * if the record may be in have a record in the database at the time we can use get method (may or may not be there )
		 * */
		//Employee emp = (Employee)s.get(Employee.class, new Integer(1));
		Employee emp = (Employee)s.load(Employee.class, new Integer(1));
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getMobile());
		System.out.println(emp.getEmail());
		s.close();
		
	}

}
