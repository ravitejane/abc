package teja.com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import teja.com.model.Doctor;

@Repository
public class DoctorDao {
	
private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addDoctor(Doctor d) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(d);
		
	}

	public void updateDoctor(Doctor d) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(d);
		
	}

	@SuppressWarnings("unchecked")
	public List<Doctor> listDoctor() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Doctor> doctorsList = session.createQuery("from Doctor").list();
		
		return doctorsList;
	}

	public Doctor getDoctorById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Doctor d = (Doctor) session.load(Doctor.class, new Integer(id));
		return d;
	}

	public void removeDoctor(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Doctor d = (Doctor) session.load(Doctor.class, new Integer(id));
		if(null != d){
			session.delete(d);
		}
	}

}
