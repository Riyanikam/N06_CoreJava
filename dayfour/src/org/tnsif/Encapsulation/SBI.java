//program to demonstrate on Encapsulation



package org.tnsif.Encapsulation;

public class SBI {
	private String accType;
	private long accountNo;
	private long atnCardNo;
	private int PinNo;
	
	public String getAccType() {
		return accType;
	}
		public void setAccType(String accType) {
		this.accType = accType;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
		public long getAccountNo() {
		return accountNo;
	}
		public long getAtnCardNo() {
		return atnCardNo;
	}
	public void setAtnCardNo(long atnCardNo) {
		this.atnCardNo = atnCardNo;
	}
	public int getPinNo() {
		return PinNo;
	}
	public void setPinNo(int pinNo) {
		PinNo = pinNo;
		
		
	}
	@Override
	public String toString() {
		return "SBI [accType=" + accType + ", accountNo=" + accountNo + ", atnCardNo=" + atnCardNo + ", PinNo=" + PinNo
				+ "]";
	}
	
	
	

}
