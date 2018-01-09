package teja.com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import teja.com.model.OutPatent;

@Repository
public class OutPatentDao {
	
	
private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	public int addOutPatent(OutPatent op) {
		Session session = this.sessionFactory.getCurrentSession();
		Serializable id=session.save(op);
		return  (Integer) id;
		
	}

	public void updateOutPatent(OutPatent op) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(op);
		
	}

	@SuppressWarnings("unchecked")
	public List<OutPatent> listOutPatent() {
		Session session = this.sessionFactory.getCurrentSession();
		List<OutPatent> outPatentList = session.createQuery("from OutPatent").list();
		
		return outPatentList;
	}

	public OutPatent getOutPatentById(int patentId) {
		System.out.println(patentId);
		Session session = this.sessionFactory.getCurrentSession();		
		OutPatent op = (OutPatent) session.get(OutPatent.class,new Integer(patentId));
		// System.out.println(d.toString());
		return op;
	}

	public void removeOutPatent(int patentId) {
		Session session = this.sessionFactory.getCurrentSession();
		OutPatent op = (OutPatent) session.load(OutPatent.class,new Integer(patentId));
		if(null != op){
			session.delete(op);
		}
	}

}
