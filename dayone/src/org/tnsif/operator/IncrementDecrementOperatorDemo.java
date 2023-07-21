package org.tnsif.operator;

public class IncrementDecrementOperatorDemo {

	public static void main(String[] args) {
		int x=23,y=6;
		int resl1=x++ + ++y;
		System.out.println(resl1);
		System.out.println(x);
		System.out.println(y);
		System.out.println("Result");
		int resl2=x-- + --y;
		System.out.println(resl2);
		System.out.println(x);
		System.out.println(y);
	}

}
