package Functtion_methods;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,45,5);

	}
	
	static void add(int a, int b) {
		int sum =a+b;
		System.out.println(sum);
	}
	
	static void add(int a, int b, int c) {
		int sum =a+b+c;
		System.out.println(sum);
	}

}
