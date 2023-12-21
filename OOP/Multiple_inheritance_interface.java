package OOP;


//interface is similar to abstract class but ,multiple inheritance is possible in interface which is not possible in abstract classes
//all fields inside interface are static and final by default
//all methods inside interface are abstract by default
//An interface cannot contain a constructor (as it cannot be used to create objects)

interface Myname{
	int age=23;
	int marks=91;
	
	
	void name();
}

interface Mysirname{
	void sirname();
}

class Info implements Myname, Mysirname{
	public void name() {
		System.out.println("Pranay");
	}
	public void sirname() {
		System.out.println("Shinde");
	}
}

public class Multiple_inheritance_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info obj = new Info();
		obj.name();
		obj.sirname();
		
		System.out.println(Myname.age);
		System.out.println(Myname.marks);

	}

}
