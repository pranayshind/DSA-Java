package OOP;

//A class implements an interface, but one interface extends another interface.
//since java8 methods of interface can have body but we have to make that methods as default
//since java8 in interface static methods also can have body

interface Myname2{
	void name();
	
	default void greet() {
		System.out.println("Hello...");
	}
	
	static void greet2() {
		System.out.println("good morning");
	}
}

interface Mysirname2 extends Myname2{
	void sirname();
}

class Info2 implements Mysirname2{
	
	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Pranay");
		
	}
	@Override
	public void sirname() {
		// TODO Auto-generated method stub
		System.out.println("Shinde");
		
	}
}


public class Interface_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info2 obj = new Info2();
		obj.name();
		obj.sirname();
		obj.greet();
		Myname2.greet2();

	}

}
