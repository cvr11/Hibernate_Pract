import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		Employee emp = (Employee)s.load(Employee.class, new Integer(4));
		emp.setMobile(0);
		s.delete(emp);
		s.saveOrUpdate(emp);
		s.flush();
		tx.commit();
		s.close();
	}

}
