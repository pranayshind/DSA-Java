package OOP;

class Human{
	String name;
	int age;
	String gender;
	static int population; //becuase population is independent of individual it is common for any individuals hence we used static
	
	
	public Human(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		Human.population+=1;
		
		
	}
	
}

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		Human h1 = new Human("Pranay",23,"male");
		Human h2 = new Human("Raj",20,"male");
		System.out.println(Human.population);
		
		//Internal working => Object Creation:
//		You create two instances of the Human class: h1 and h2.
//		The Human class has a constructor that takes three parameters (name, age, and gender). When you create a new Human object, 
//		you pass specific values for these parameters.
//		The constructor initializes the instance variables (name, age, gender) with the provided values, and then increments the 
//		population static variable by 1.
//		
//		Constructor Execution:
//
//			When new Human("Pranay", 23, "male") is called, the constructor is executed.
//			The instance variables (name, age, gender) of the h1 object are set to "Pranay", 23, and "male", respectively.
//			The population static variable of the Human class is incremented by 1 (Human.population += 1;).
//			The same process occurs for h2:
//
//			The instance variables of the h2 object are set to "Raj", 20, and "male".
//			The population static variable is again incremented by 1.
//			Resulting Population:
//
//			After creating both objects (h1 and h2), the population static variable is now equal to 2.
//			This means that two Human objects have been created, and the population
//			static variable reflects the total count of instances created from the Human class.
//
//			In summary, the population static variable serves as a shared counter for all instances of the Human class. Each time a new Human object 
//			is created, the constructor increments the population by 1. This ensures that the population variable represents the total count of Human 
//			objects created throughout the program. In the provided example, the final value of population is 2, indicating that two instances (h1 and h2)
//			of the Human class have been created.
//		

	}

}
