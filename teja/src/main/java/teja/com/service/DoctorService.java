package teja.com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teja.com.dao.DoctorDao;
import teja.com.model.Doctor;


@Service
@Transactional
public class DoctorService {
	
	@Autowired
	private DoctorDao doctorDao;

	public void setDoctorDao(DoctorDao doctorDao) {
		this.doctorDao = doctorDao;
	}

	
	@Transactional
	public String addDoctor(Doctor d) {
		return this.doctorDao.addDoctor(d);
	}

	@Transactional
	public void updateDoctor(Doctor d) {
		this.doctorDao.updateDoctor(d);
	}

	@Transactional
	public List<Doctor> listDoctors() {
		return this.doctorDao.listDoctor();
	}

	@Transactional
	public Doctor getDoctorById(String id) {
		return this.doctorDao.getDoctorById(id);
	}

	@Transactional
	public void removeDoctor(String id) {
		this.doctorDao.removeDoctor(id);
	}

}
