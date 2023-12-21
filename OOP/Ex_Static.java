package OOP;

public class Ex_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex_Static obj  = new Ex_Static();
		fun();  //we dont need of object to run this method because it is static
		obj.greeting2();  //we need object to run this method because it is non static
		
		
		

	}
	
	static void fun() {
	 System.out.println("I am static method");
	 
	  Ex_Static obj = new Ex_Static();
	  obj.greeting();
	  
		
	}
	
	 void greeting() {
		System.out.println("Hello");  //greeting method is not static means we need to create object of class for accessing it..
	 }
	 
	 void greeting2() {
		 greeting();
		 System.out.println("Pranay");
		 
	 }

}
