package sjsu.edu.cmpe275.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RoomOtherType {
	@Column(name="roomOtherType")
	private String roomOtherType;
	@Column(name="basePrice")
	private double base_price;
	public double getBase_price() {
		return base_price;
	}
	public void setBase_price(double base_price) {
		this.base_price = base_price;
	}
	public String getRoomOtherType() {
		return roomOtherType;
	}
	public void setRoomOtherType(String roomOtherType) {
		this.roomOtherType = roomOtherType;
	}
}
