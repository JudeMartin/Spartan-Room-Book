package sjsu.edu.cmpe275.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import sjsu.edu.cmpe275.util.StringConstants;
//@Entity
public enum RoomStatus {
	AVAILABLE(0, StringConstants.STATUS_AVAILABLE), 
	RESERVED(1, StringConstants.STATUS_RESERVED), 
	INUSE(2, StringConstants.STATUS_IN_USE);
	
	//@Column(name="room_status_id")
	private int roomStatusId;
	
	//@Column(name="room_status_name")
	private String roomStatusName;
	
	
	private RoomStatus(int id, String name){
		roomStatusId = id;
		roomStatusName = name;
	}


	public int getRoomStatusId() {
		return roomStatusId;
	}


	public void setRoomStatusId(int roomStatusId) {
		this.roomStatusId = roomStatusId;
	}


	public String getRoomStatusName() {
		return roomStatusName;
	}


	public void setRoomStatusName(String roomStatusName) {
		this.roomStatusName = roomStatusName;
	}
	

}
