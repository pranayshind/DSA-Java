package Functtion_methods;

import java.util.Arrays;

public class VarArgs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun("Pranay","VAibhav","Sujal","akash");

	}
	static void fun(String...s) {
		System.out.println(Arrays.toString(s));
	}

}
