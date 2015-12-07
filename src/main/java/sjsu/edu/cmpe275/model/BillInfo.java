package sjsu.edu.cmpe275.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Payment")
public class BillInfo implements Serializable {

	private static final long serialVersionUID = -723583058586873479L;

	@Id
	@Column(name = "payment_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long payment_id;

	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reservation_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Reservation reservation;

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Column(name = "total_payment")
	private Double total_payment;
	@Column(name = "rooms")
	private int rooms;
	@Column(name = "days")
	private int days;
	@Column(name = "discount")
	private int discount;
	@Column(name = "base")
	private Double base;

	@Column(name = "first_name")
	private String first_name;

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

	@Column(name = "last_name")
	private String last_name;

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
	@Override
	public String toString(){
		return "["+" payment_id "+payment_id+", total_payment"+total_payment+", rooms"+rooms+", days"+days+", discount"+discount
		+", base price"+base+", first_name"+first_name+", last_name"+last_name+", days"+days
		+", reservation details"+reservation.toString();
	}
}
