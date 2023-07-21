package org.tnsif.introduction;
import java.util.*;

class ReverseArray {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");

        int  n = sc.nextInt();
        int start = 0, end=n-1;
//        System.out.println("Enter the array size");
        int array[] = new int[10];
        System.out.println("Enter the Array elements");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        while (start < end) {
            int temp =array[ start];
            array[start] =array[ end];
            array[end]=temp;
            start++;
            end--;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        sc.close();
    }
}