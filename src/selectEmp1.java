

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class selectEmp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg= new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx= s.beginTransaction();
		Employee emp1 = (Employee)s.load(Employee.class, new Integer(2));
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getMobile());
		System.out.println(emp1.getEmail());
		System.out.println(" Query Excuted !...");
		s.close();
	}

}
