package org.tnsif.hirInter;

public class Trimisu extends Android {

	private int Version;
	
	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
	}

	public Trimisu(String brand, String slotType, int Version) {
		super(brand, slotType);
		this.Version=Version;
	}

	@Override
	public String toString() {
		return "Trimisu [Version=" + Version + ", toString()=" + super.toString() + "]";
	}
	
	


}
