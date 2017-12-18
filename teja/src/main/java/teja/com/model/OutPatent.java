package teja.com.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="outPatent")  
@AttributeOverrides({  
    @AttributeOverride(name="patentId", column=@Column(name="patentId")),  
    @AttributeOverride(name="name", column=@Column(name="name")),  
    @AttributeOverride(name="dateOfBirth", column=@Column(name="dateOfBirth")) ,  
    @AttributeOverride(name="address", column=@Column(name="address")) ,  
    @AttributeOverride(name="phoneNo", column=@Column(name="phoneNo")) ,  
    @AttributeOverride(name="gender", column=@Column(name="gender")) ,  
    @AttributeOverride(name="email", column=@Column(name="email")) ,
    @AttributeOverride(name="bloodGroup", column=@Column(name="bloodGroup")) ,
    @AttributeOverride(name="occupation", column=@Column(name="occupation")) ,
    @AttributeOverride(name="maritalStatus", column=@Column(name="maritalStatus")) 
})  
public class OutPatent extends Patent {
	
	private Date appointmentDate;
	private String precption;
	
	
//	private Doctor doctorInCharge;  // apply one to many
	
	
	
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getPrecption() {
		return precption;
	}
	public void setPrecption(String precption) {
		this.precption = precption;
	}
	
	
}
