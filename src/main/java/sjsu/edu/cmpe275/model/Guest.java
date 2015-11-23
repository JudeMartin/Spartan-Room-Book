package sjsu.edu.cmpe275.model;

public class Guest {
	
	private String phone;
	private String first_name;
	private String last_name;
	private String email;
	private String driver_license;
	private String country;
	private String city;
	private String address;
	private Integer guest_id;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDriver_license() {
		return driver_license;
	}
	public void setDriver_license(String driver_license) {
		this.driver_license = driver_license;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(Integer guest_id) {
		this.guest_id = guest_id;
	}
}	
	
/*
 * 
 * INSERT INTO `roombooking`.`guest`
(`phone`,
`last_name`,
`guest_id`,
`first_name`,
`email`,
`driver_license`,
`country`,
`city`,
`address`)
 * */
