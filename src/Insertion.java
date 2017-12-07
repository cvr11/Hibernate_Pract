import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg= new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx= s.beginTransaction();
		
		/*Employee emp1 = new Employee();
		emp1.setId(7);
		emp1.setName("Banni");
		emp1.setMobile(984000027);
		emp1.setEmail("banni4@gmail.com");
		System.out.println("inserted ");
		*/
		
		Employer e = new Employer();
		e.setId(6);
		e.setFname("RAJA");
		e.setLname("lala");
		e.setEmail("lalar@yahoo.com");
		e.setMobile(123123);
		e.setRole("Java Tester");
		e.setSalary(5999);
		e.setBonus(988);
		System.out.println("inserted ");
		
		s.save(e);
		s.flush();
		tx.commit();
		s.close();
		
	}

}
