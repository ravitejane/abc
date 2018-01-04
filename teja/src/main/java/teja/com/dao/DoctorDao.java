package teja.com.dao;

import java.io.Serializable;
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

	public String addDoctor(Doctor d) {
		Session session = this.sessionFactory.getCurrentSession();
		Serializable dId=session.save(d);
		return (String) dId;
		
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

	public Doctor getDoctorById(String id) {
		System.out.println(id);
		Session session = this.sessionFactory.getCurrentSession();		
		Doctor d = (Doctor) session.get(Doctor.class, id);
		// System.out.println(d.toString());
		return d;
	}

	public void removeDoctor(String id) {
		Session session = this.sessionFactory.getCurrentSession();
		Doctor d = (Doctor) session.load(Doctor.class, id);
		if(null != d){
			session.delete(d);
		}
	}

}
