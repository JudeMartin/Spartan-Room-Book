package sjsu.edu.cmpe275.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Reservation {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reservation_id")
	private Long reservationId;
	
	@Column(name="guest_id")
	private Long guestId;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="room_id")
	@NotFound(action=NotFoundAction.IGNORE)
	private Room room;
	
	@DateTimeFormat(pattern="MM-dd-yyyy")
	@Column(name="reservation_date")
	private Date reservationDate;
	
	@DateTimeFormat(pattern="MM-dd-yyyy")
	@Column(name="check_in_date")
	private Date checkInDate;

	@DateTimeFormat(pattern="MM-dd-yyyy")
	@Column(name="check_out_date")
	private Date checkOutDate;

	private int adults = 0;
	private int children = 0;
	private int rooms = 0;

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


	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	@Basic
    @Temporal(TemporalType.DATE)
    @NotNull
    @Future
	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	
	@Basic
    @Temporal(TemporalType.DATE)
    @NotNull
    @Future
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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", guestId=" + guestId + ", room=" + room
				+ ", reservationDate=" + reservationDate + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", adults=" + adults + ", children=" + children + ", rooms=" + rooms
				+ ", amenityTypeId=" + amenityTypeId + "]";
	}

	
}
