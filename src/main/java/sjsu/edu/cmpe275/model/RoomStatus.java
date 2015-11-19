package sjsu.edu.cmpe275.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RoomStatus {
	
	
	@Column(name="roomStatus")
	private String roomStatus;

	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	

}
