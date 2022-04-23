import org.hibernate.*;

import org.hibernate.cfg.Configuration;

public class ClientForSave {

	public static void main(String[] args) {


		Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		

		Product p=new Product();
		
		
		p.setProductId(103);
		p.setProName("Mobile");
		p.setPrice(35000);
		
		
		Transaction tx=session.beginTransaction();
		session.save(p);
		
		System.out.println("Record Saved Successfully.....");
		
		tx.commit();
		
		session.close();
		factory.close();
		
		
	}

}
