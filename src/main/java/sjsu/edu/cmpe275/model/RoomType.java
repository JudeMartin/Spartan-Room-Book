package sjsu.edu.cmpe275.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RoomType {
	@Column(name="roomType")
    private String roomType;

	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
}