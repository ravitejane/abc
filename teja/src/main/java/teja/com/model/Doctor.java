package teja.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Doctor {
	
	
	
	private String dId;
	private String name;
	private long phoneNo;
	private String address;
	private String specialization;
	
	@Id
	@GenericGenerator(name="seq_id", strategy="teja.com.utility.DoctorPrimaryKeyGen")
	@GeneratedValue(generator="seq_id")
	@Column(name = "dId", unique = true, nullable = false, length = 20)
	public String getdId() {
		return dId;
	}
	public void setdId(String dId) {
		this.dId = dId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	

}
