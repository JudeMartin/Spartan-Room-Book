package sjsu.edu.cmpe275.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Guest {
	
	@Id
	@Column (name = "guest_id")
	private Long guest_id;
	@Column (name = "first_name")
	private String first_name;
	@Column (name = "last_name")
	private String last_name;
	@Column (name = "address")
	private String address;
	@Column (name = "email")
	private String email;
	@Column (name = "phone")
	private String phone;
	@Column (name = "city")
	private String city;
	@Column (name = "country")
	private String country;
	@Column (name = "driver_license")
	private String driver_license;
	
	public Long getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(Long guest_id) {
		this.guest_id = guest_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDriver_license() {
		return driver_license;
	}
	public void setDriver_license(String driver_license) {
		this.driver_license = driver_license;
	}
	

}
