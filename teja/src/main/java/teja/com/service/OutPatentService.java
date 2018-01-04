package teja.com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teja.com.dao.OutPatentDao;
import teja.com.model.OutPatent;

@Service
@Transactional
public class OutPatentService {
	

	@Autowired
	private OutPatentDao outPatentDao;

	public void setOutPatent(OutPatentDao outPatentDao) {
		this.outPatentDao = outPatentDao;
	}

	
	@Transactional
	public int addOutPatent(OutPatent op) {
		return this.outPatentDao.addOutPatent(op);
	}

	@Transactional
	public void updateOutPatent(OutPatent op) {
		this.outPatentDao.updateOutPatent(op);
	}

	@Transactional
	public List<OutPatent> listOutPatent() {
		return this.outPatentDao.listOutPatent();
	}

	@Transactional
	public OutPatent getOutPatentById(String id) {
		return this.outPatentDao.getOutPatentById(id);
	}

	@Transactional
	public void removeOutPatent(String id) {
		this.outPatentDao.removeOutPatent(id);
	}


}
