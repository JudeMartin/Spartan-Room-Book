package sjsu.edu.cmpe275.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="room_id")
    private Long id;

	@Column(name="room_type_id")
	private int roomTypeId;	
	
	@Column(name="other_type_id")
	private int otherTypeId;
	
	@Column(name="status_id")
	private int statusId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public int getOtherTypeId() {
		return otherTypeId;
	}

	public void setOtherTypeId(int otherTypeId) {
		this.otherTypeId = otherTypeId;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", roomTypeId=" + roomTypeId + ", otherTypeId=" + otherTypeId + ", statusId="
				+ statusId + "]";
	}
	
	
}
