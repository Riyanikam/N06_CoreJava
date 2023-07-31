package org.tnsif.hirInter;

public class SnowCone extends Android {
	
	
	
	private int Version;
	
	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		this.Version = version;
	}

	

	public SnowCone(String brand, String slotType) {
		super(brand, slotType);
	}

	public SnowCone(String brand, String slotType , int version) {
		super(brand,slotType);
		this.Version=version;
	}

	@Override
	public String toString() {
		return "SnowCone [Version=" + Version + ", toString()=" + super.toString() + "]";
	}
	

}
