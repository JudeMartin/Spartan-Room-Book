package sjsu.edu.cmpe275.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Payment")
public class BillInfo {
	
	@Id
	@Column (name = "payment_id", nullable=false)
	private Long payment_id;
	@Column (name = "guest_id")
	private Long guest_id;
	@Column (name = "total_payment")
	private Double total_payment;
	@Column (name = "rooms")
	private int rooms;
	@Column (name = "days")
	private int days;
	@Column (name = "discount")
	private int discount;
	@Column (name = "base")
	private Double base;
	
	public int getDays() {
		return days;
	}
	public void setDays(long dayQty) {
		this.days = (int) dayQty;
	}
	public Long getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int i) {
		this.payment_id = (long) i;
	}
	public Long getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(Long guest_id) {
		this.guest_id = guest_id;
	}
	public Double getTotal_payment() {
		return total_payment;
	}
	public void setTotal_payment(Double total_payment) {
		this.total_payment = total_payment;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	

}
