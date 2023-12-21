package OOP;

//Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
//As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity. 
//However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class. 
//For example:

interface Myname1{
	void name();
}

interface Mysirname1{
	void name();
}

class Info1 implements Myname1, Mysirname1{
	public void name() {
		System.out.println("Pranay");
	}
}

public class Multiple_inheritance_interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info1 obj = new Info1();
		obj.name();

	}

}
