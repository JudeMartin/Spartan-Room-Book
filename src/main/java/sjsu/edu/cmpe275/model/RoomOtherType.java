package sjsu.edu.cmpe275.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import sjsu.edu.cmpe275.util.StringConstants;

//@Entity(name="OtherType")
public enum RoomOtherType {
	SMOKING(1, StringConstants.OTHER_TYPE_SMOKING, 150),
	NONSMOKING(2, StringConstants.OTHER_TYPE_NON_SMOKING, 100);
	
	//@Column(name="other_type_id")
	private int otherTypeId;
	
	//@Column(name="other_type_name")
	private String otherTypeName;
	
	//@Column(name="base_price")
	private float basePrice;
	
	private RoomOtherType(int id, String name,int price){
		this.otherTypeId = id;
		this.otherTypeName = name;
		this.basePrice = price;
	}

	public int getOtherTypeId() {
		return otherTypeId;
	}

	public void setOtherTypeId(int otherTypeId) {
		this.otherTypeId = otherTypeId;
	}

	public String getOtherTypeName() {
		return otherTypeName;
	}

	public void setOtherTypeName(String otherTypeName) {
		this.otherTypeName = otherTypeName;
	}

	public float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}
	
}
