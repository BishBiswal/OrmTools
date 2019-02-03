package com.costesch.member.employeeservice.bean;

public class Clientdetails {
	private int vendor_id;
	private String vendor_name;
	private String position;
	private String location;
	public Clientdetails(int vendor_id, String vendor_name, String position, String location) {
		super();
		this.vendor_id = vendor_id;
		this.vendor_name = vendor_name;
		this.position = position;
		this.location = location;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Clientdetails [vendor_id=" + vendor_id + ", vendor_name=" + vendor_name + ", position=" + position
				+ ", location=" + location + "]";
	}
	
	
	

}
