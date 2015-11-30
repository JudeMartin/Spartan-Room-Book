package sjsu.edu.cmpe275.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

public class Reservation {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reservation_id")
	private Long reservationId;
	
	@Column(name="guest_id")
	private Long guestId;
	
	@Column(name="room_id")
	private Long roomId;
	
	@DateTimeFormat(pattern="MM-dd-yyyy")
	@Column(name="reservation_date")
	private Date reservationDate;
	
	@DateTimeFormat(pattern="MM-dd-yyyy")
	@Column(name="check_in_date")
	private Date checkInDate;

	@DateTimeFormat(pattern="MM-dd-yyyy")
	@Column(name="check_in_date")
	private Date checkOutDate;

	private int adults;
	private int children;

	private int amenityTypeId = RoomOtherType.SMOKING.getOtherTypeId();

	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}

	public Long getGuestId() {
		return guestId;
	}

	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
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
	
	
	
	
	
}
