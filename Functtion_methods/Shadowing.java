package Functtion_methods;

public class Shadowing {
	
	static int x=40;  //this x will shadowed/override at line 11
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		int x = 50;
		System.out.println(x);
		func();

	}
	static void func() {
		System.out.println(x);
	}

}
