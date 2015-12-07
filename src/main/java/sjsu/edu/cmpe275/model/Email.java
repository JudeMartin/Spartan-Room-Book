package sjsu.edu.cmpe275.model;

import java.util.Date;

public class Email {
	
	private String email_id;
	private String userName;
	private Date booking_date;
	private Date check_in_date;
	private Date check_out_date;
	private int days;
	private double total_payment;
	private Long room_id;
	private String room_type;
	private int roomsQty;
	private Long reservation_id;
	private String cancel_url;
	private String other_type;
	private int adults;
	private int children;
	private double base_pay;
	private double extra_pay;
	private int discount;
	private int tax;
	
	
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public double getBase_pay() {
		return base_pay;
	}
	public void setBase_pay(double base_pay) {
		this.base_pay = base_pay;
	}
	public double getExtra_pay() {
		return extra_pay;
	}
	public void setExtra_pay(double extra_pay) {
		this.extra_pay = extra_pay;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public Long getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(Long reservation_id) {
		this.reservation_id = reservation_id;
	}
	public String getCancel_url() {
		return cancel_url;
	}
	public void setCancel_url(String cancel_url) {
		this.cancel_url = cancel_url;
	}
	public String getOther_type() {
		return other_type;
	}
	public void setOther_type(String other_type) {
		this.other_type = other_type;
	}
	public Date getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}
	public Date getCheck_in_date() {
		return check_in_date;
	}
	public void setCheck_in_date(Date check_in_date) {
		this.check_in_date = check_in_date;
	}
	public Date getCheck_out_date() {
		return check_out_date;
	}
	public void setCheck_out_date(Date check_out_date) {
		this.check_out_date = check_out_date;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public double getTotal_payment() {
		return total_payment;
	}
	public void setTotal_payment(double total_payment) {
		this.total_payment = total_payment;
	}
	public Long getRoom_id() {
		return room_id;
	}
	public void setRoom_id(Long room_id) {
		this.room_id = room_id;
	}
	public String getType() {
		return room_type;
	}
	public void setType(String type) {
		this.room_type = type;
	}
	public int getRoomsQty() {
		return roomsQty;
	}
	public void setRoomsQty(int roomsQty) {
		this.roomsQty = roomsQty;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
