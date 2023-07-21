package org.tnsif.operator;
import java.util.*;

public class AssignmentOpertor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		System.out.println("Enter the value of y");
		int y=sc.nextInt();
		//int x=12,y=7;
		x=-y;//x=x-y
		System.out.println(x);
		sc.close();
	}

}
