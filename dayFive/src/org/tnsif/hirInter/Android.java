package org.tnsif.hirInter;

public class Android {
	private String Brand;
	private String slotType;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	@Override
	public String toString() {
		return "Android [Brand=" + Brand + ", slotType=" + slotType + "]";
	}
	public Android(String brand, String slotType) {
		super();
		Brand = brand;
		this.slotType = slotType;
	}
	
	

}
