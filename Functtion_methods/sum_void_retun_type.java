package Functtion_methods;

import java.util.Scanner;

public class sum_void_retun_type {
	
	static void add() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1 = in.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2 = in.nextInt();
		int n3=n1+n2;
		System.out.println("sum of 2 numbers is: "+n3);
		
		

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();
		
		
	}
}
