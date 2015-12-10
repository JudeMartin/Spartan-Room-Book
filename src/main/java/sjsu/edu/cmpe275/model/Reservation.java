package sjsu.edu.cmpe275.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "RESERVATION")
public class Reservation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "reservation_id")
	private Long reservationId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "guest_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Guest guest;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "room_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Room room;

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	 
	@Column(name = "reservation_date")
	private java.sql.Date reservationDate;
 
	@Column(name = "check_in_date")
	private java.sql.Date checkInDate;
 
	@Column(name = "check_out_date")
	private java.sql.Date checkOutDate;

	private int adults;
	private int children;
	private int rooms;

	private int amenityTypeId = RoomOtherType.SMOKING.getOtherTypeId();

	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate =(java.sql.Date) reservationDate;
	}

	@Basic
	@Temporal(TemporalType.DATE)
	@NotNull
	@Future
	public java.sql.Date getCheckInDate() {
		return (java.sql.Date) checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate =(java.sql.Date) checkInDate;
	}

	@Basic
	@Temporal(TemporalType.DATE)
	@NotNull
	@Future
	public java.sql.Date getCheckOutDate() {
		return (java.sql.Date) checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = (java.sql.Date)checkOutDate;
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

	public int getAmenityTypeId() {
		return amenityTypeId;
	}

	public void setAmenityTypeId(int amenityTypeId) {
		this.amenityTypeId = amenityTypeId;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + reservationId  + ", reservationDate=" + reservationDate
				+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", amenityTypeId=" + amenityTypeId
				+ ", adults=" + adults + ", children=" + children + " ]" + "Guests [" + guest.toString() + "]" + "Room [" + room.toString() +"]";
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
}