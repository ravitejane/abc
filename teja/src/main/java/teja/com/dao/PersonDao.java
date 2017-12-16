package teja.com.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import teja.com.model.Person;

@Repository
public class PersonDao 
{
	@PostConstruct
	public void myinit()
	{
		System.out.println("ok");
	}
	@PreDestroy
	public void destory()
	{
		
	}
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf)
	{
		this.sessionFactory = sf;
	}
	
	
	
	public void addPerson(Person p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		
	}
}