package Functtion_methods;

import java.util.Scanner;

public class sum_int_return_type {
	
	static int sum() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1 = in.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2 = in.nextInt();
		int n3=n1+n2;
		
		return n3;  //any statement after return will give compile time error
		
	}
	
	public static void main(String[] args) {
		int ans = sum();
		System.out.println("Sum of 2 numbers is: "+ans);
	}

}
