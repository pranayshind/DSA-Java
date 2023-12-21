package OOP;

//If you need to do computation in order to initialize your static variables,
//you can declare a static block that gets executed exactly once, when the class is first loaded.


public class Static_Block {
	
	static int a=10;
	static int b;
	static {
		System.out.println("pranay");
		b=a+5;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Block obj1 = new Static_Block();  //static block executed only once immediately after we create object of the class of staticblock
		Static_Block obj2 = new Static_Block();
		
		System.out.println(b);
		
		System.out.println(Static_Block.a);
		System.out.println(Static_Block.b);
		

	}

}
