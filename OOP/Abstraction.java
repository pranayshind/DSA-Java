package OOP;

//we cannot create object of abstract class
//abstract methods dont have body
//abstract methods compulsory needs to be overridden in child class 
//here we create constructor of abstract laptop class but we cant create object of abstract class hence we need to inherit it in child class and then we need to create object of  child class to access it
abstract class Laptop{
	String Processor;
	String OS;
	int Price;
	
	public Laptop(String processor, String oS, int price) {
		super();
		Processor = processor;
		OS = oS;
		Price = price;
	}
	
	static void congrats(){
		System.out.println("Congratulations.........");
	}
	
	abstract void purchase();
	
	
	
}

class Asus extends Laptop{

	public Asus(String processor, String oS, int price) {
		super(processor, oS, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void purchase() {
		// TODO Auto-generated method stub
		System.out.println("Asus laptop is purchased..");
		
	}
	
}

class Lenovo extends Laptop{
	public Lenovo(String Processor, String OS, int Price) {
		super(Processor,OS,Price);
	}
	
	void purchase() {
		System.out.println("Lenovo laptop is purchased..");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asus obj1 = new Asus("I5","Windows",62000);
		Lenovo obj2= new Lenovo("AMD","Windows",40000);
		
		Laptop.congrats();//congrats method is static hence we  can access it directly by class name because static methods did not depend on objects they depends on class
		obj1.purchase();
		System.out.println(obj1.OS+" "+obj1.Price+" "+obj1.Processor);
		

	}

}
