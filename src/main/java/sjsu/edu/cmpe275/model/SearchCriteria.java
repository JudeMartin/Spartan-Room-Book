package sjsu.edu.cmpe275.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SearchCriteria {

	int rooms = 0 ;
	private int adults = 0;
	private int children = 0;
	//@DateTimeFormat(pattern = "MM-dd-yyyy")
	//@DateTimeFormat(pattern = "dd/mm/yy")
	private Date checkInDate;
	//@DateTimeFormat(pattern = "dd/mm/yy")
	private Date checkOutDate;
	private int roomType;
	
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
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
	public int getRoomType() {
		return roomType;
	}
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	
	@Override
	public String toString() {
		return "SearchCriteria [rooms=" + rooms + ", adults=" + adults + ", children=" + children + ", checkInDate="
				+ checkInDate + ", checkOutDate=" + checkOutDate + ", roomType=" + roomType + "]";
	}
	
	
}
