package Functtion_methods;

import java.util.Scanner;

public class greetin_arguments_2 {
	
	static String msg(String greet) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name: ");
		String n = in.next();
		
		String message = greet + " " + n;
		
		return message;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = msg("Hello--->");
		System.out.println(ans);
		

	}

}
