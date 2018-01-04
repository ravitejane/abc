package teja.com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import teja.com.model.Login;

@Repository
public class LoginDao {
	
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	public Login getByName(String name) {
		Session session = this.sessionFactory.getCurrentSession();
		Login l=(Login) session.load(Login.class, name);
		return l;
	}
	
	public void addLogin(Login l) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(l);
		
	}

}
