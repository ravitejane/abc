package teja.com.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
@Table(name="inPatent")  
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
public class InPatent extends Patent {
	
	private Date joiningDate;
	private String staus;
	
	
	@OneToOne(mappedBy="inPatent", cascade=CascadeType.ALL)
	private Bed bed;

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getStaus() {
		return staus;
	}

	public void setStaus(String staus) {
		this.staus = staus;
	}



	
}
