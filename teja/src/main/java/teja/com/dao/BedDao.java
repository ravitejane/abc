package teja.com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import teja.com.model.Bed;

@Repository
public class BedDao {
	
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addBed(Bed d) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(d);
		
	}

	public void updateBed(Bed d) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(d);
		
	}

	@SuppressWarnings("unchecked")
	public List<Bed> listBed() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Bed> bedsList = session.createQuery("from Bed").list();
			for(int i=0;i<bedsList.size();i++)
			{
				System.out.println((bedsList.get(i)).toString());
			}
		return bedsList;
	}

	public Bed getBedByNo(String bedNo) {
		
		Session session = this.sessionFactory.getCurrentSession();		
		Bed d = (Bed) session.get(Bed.class, bedNo);
		
		return d;
	}

	public void removeBed(String bedNo) {
		Session session = this.sessionFactory.getCurrentSession();
		Bed d = (Bed) session.load(Bed.class,bedNo);
		if(null != d){
			session.delete(d);
		}
	}

}
