package OOP;


class Student1{
	int id;
	String name;
	int marks;
	
	//constructor overloading=> same constructor name but different parameters
	
	//1st 
	//this way of using constructor is not good because 
	Student1(){
		this.id=101;
		this.name="Pranay";
		this.marks=91;
	}
	
	//2nd constructor
	//this is the best way of using constructors
	Student1(int id,String name,int marks){
		this.id = id;
		this.name=name;
		this.marks=marks;
	}
	
	//3rd constructor => to pass values of other objects
	Student1(Student1 other){
		this.id=other.id;
		this.name=other.name;
		this.marks=other.marks;
	}
		
		
}
public class Constructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1st constructor");
		//it will call 1st constructor i.e.without parameter one or empty one
		Student1 s1 = new Student1();
		System.out.println(s1.id+" "+s1.name+" "+s1.marks);
		
		
		System.out.println("2nd constructor");
		//it will call 2nd constructor i.e.with parameter one
		Student1 s2 = new Student1(50,"virat",95);
		System.out.println(s2.id+" "+s2.name+" "+s2.marks);
		
		
		System.out.println("3rd constructor");
		//it will call 3rd constructor 
		Student1 s3 = new Student1(s1);
		System.out.println(s3.id+" "+s3.name+" "+s3.marks);
		Student1 s4 = new Student1(s2);
		System.out.println(s4.id+" "+s4.name+" "+s4.marks);
		

	}

}
