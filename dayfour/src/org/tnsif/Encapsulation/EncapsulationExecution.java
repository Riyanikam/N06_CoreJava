package org.tnsif.Encapsulation;

public class EncapsulationExecution {

	public static void main(String[] args) {
		SBI s=new SBI();
		s.setAccType("Saving Account");
		s.setAccountNo(123455678l);
		s.setAtnCardNo(12345678890l);
		s.setPinNo(1212);
		
		System.out.println(s);
	}

}
