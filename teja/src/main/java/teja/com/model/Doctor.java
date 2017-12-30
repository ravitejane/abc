package teja.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dId;
	private String name;
	private long phoneNo;
	private String address;
	private String specialization;
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
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
	
	
	public Doctor(int dId, String name, long phoneNo, String address,
			String specialization) {
		super();
		this.dId = dId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.specialization = specialization;
		
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
