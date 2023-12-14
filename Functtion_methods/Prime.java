package Functtion_methods;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = in.nextInt();
		
		
		boolean a = isPrime(num);
		System.out.println(a);

	}
	
	static boolean isPrime(int n) {
		
		if(n<=1) {
			return false;
		}
		
		int c=2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
				
			}
			c++;
		}
		
		return true;  // also we can write ==> return c*c>n
		
	}

}
