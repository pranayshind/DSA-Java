package Functtion_methods;

import java.util.Arrays;


//variable length arguments useful when we dont know the number of arguments
public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(10,45,75,78,85);

	}
	static void fun(int...v) {
		System.out.println(v);//print address of array
		System.out.println(Arrays.toString(v));//print arryay 
	}

}
