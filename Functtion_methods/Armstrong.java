package Functtion_methods;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = in.nextInt();
		
		boolean obj = isArmstrong(num);
		System.out.println(obj);

	}
	
	static boolean isArmstrong(int n) {
		String s = Integer.toString(n);
		int len = s.length();
		
		int sum=0;
		int temp=n;
		
		while(temp>0) {
			int rem=temp%10;
			sum= (int) (sum+Math.pow(rem, len));
			temp=temp/10;
			
			}
		if(sum==n) {
			return true;
		}
	
		return false;

		/*Instaed of this 
		 * if(sum==n) { return true; }
		 * 
		 *return false;
		 * we can also just write =>>>  return sum==n;
		 */
	}

}
