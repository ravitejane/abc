package teja.com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teja.com.dao.BedDao;
import teja.com.model.Bed;

@Service
@Transactional
public class BedService {
	
	@Autowired
	private BedDao bedDao;

	public void setBedDao(BedDao bedDao) {
		this.bedDao = bedDao;
	}
	public void addBed(Bed d) {
		this.bedDao.addBed(d);		
	}

	public void updateBed(Bed d) {
		this.bedDao.updateBed(d);		
	}

	
	public List<Bed> listBed() {		
		return this.bedDao.listBed();
	}

	public Bed getBedByNo(String bedNo) {
		
		return this.bedDao.getBedByNo(bedNo);
	}

	public void removeBed(String bedNo) {
		this.bedDao.removeBed(bedNo);
	}
	

}
