package Functtion_methods;

import java.util.Arrays;

//variable length arguments with different datatypes

public class VarArgs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun("Pranay","Vaibhav",10,45,78,5,45);

	}
	static void fun(String a, String b, int...arr) {
		System.out.println(a+" "+b+" "+Arrays.toString(arr));
	}

}
