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

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "guest_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Guest guest;

	@Column(name = "room_id")
	private Long roomId;

	@DateTimeFormat(pattern = "MM-dd-yyyy")
	@Column(name = "reservation_date")
	private Date reservationDate;

	@DateTimeFormat(pattern = "MM-dd-yyyy")
	@Column(name = "check_in_date")
	private Date checkInDate;

	@DateTimeFormat(pattern = "MM-dd-yyyy")
	@Column(name = "check_out_date")
	private Date checkOutDate;

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

	@Override
	public String toString() {
		return "Reservation [id=" + reservationId + ", roomId=" + roomId + ", reservationDate=" + reservationDate
				+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", amenityTypeId=" + amenityTypeId
				+ ", adults=" + adults + ", children=" + children + " ]" + "Guests [" + guest.toString() + "]";
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
}