package teja.com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teja.com.dao.LoginDao;
import teja.com.model.Login;

@Service
@Transactional
public class LoginService {
	
	private LoginDao ls;	
	@Autowired
	public void setLs(LoginDao ls) {
		this.ls = ls;
	}
	
	public void addLogin(Login l) {
		ls.addLogin(l);		
	}


	public String checkLogin(Login l)
	{
		
		Login login=ls.getByName(l.getUsername());
		if(l.hashCode()==login.hashCode())
		{
			return login.getRole();
		}
		else	
		{			
			return "fail";
		}
	}

}
