package teja.com.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	private String dId;
	private String name;
	private long phoneNo;
	private String address;
	private String specialization;
	private String prescription;
	
	

}
