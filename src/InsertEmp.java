import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx= s.beginTransaction();
		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setName("KIng");
		emp1.setMobile(55555555);
		emp1.setEmail("King14@gmail.com");
		System.out.println("inserted ");
		s.save(emp1);
		s.flush();
		tx.commit();
		s.close();
		
		
	}

}
