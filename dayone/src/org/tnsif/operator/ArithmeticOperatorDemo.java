//program to demonstrate the ArithmeticOperator
package org.tnsif.operator;
import java.util.*;

import java.util.Scanner;

@SuppressWarnings("unused")
public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 numbers");
		int n=sc.nextInt();
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		sc.close();
	}

}
