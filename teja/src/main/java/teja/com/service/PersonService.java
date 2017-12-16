package teja.com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teja.com.dao.PersonDao;
import teja.com.model.Person;

@Service
@Transactional
public class PersonService {
	
	@Autowired
	PersonDao pd;
	
	@Transactional
	public void addPerson(Person p) {
		pd.addPerson(p);
	}

}
