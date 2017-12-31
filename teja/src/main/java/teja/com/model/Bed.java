package teja.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bed")
public class Bed {
	
	@Id
	@Column(name="bedNo")
	private String bedNo;	
	private int roomNo;
	private String wardName;	
	private String roomType;
	private int charge;	
	private boolean status;
		
	public String getBedNo() {
		return bedNo;
	}
	public void setBedNo(String bedNo) {
		this.bedNo = bedNo;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getWardName() {
		return wardName;
	}
	public void setWardName(String wardName) {
		this.wardName = wardName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Bed(String bedNo, int roomNo, String wardName, String roomType,
			int charge, boolean status) {
		super();
		this.bedNo = bedNo;
		this.roomNo = roomNo;
		this.wardName = wardName;
		this.roomType = roomType;
		this.charge = charge;
		this.status = status;
	}
	public Bed() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bedNo+" "+roomNo;
	}
	
	
}
