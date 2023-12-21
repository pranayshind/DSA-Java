package OOP;


class Student{
	int id;
	String name;
	int marks;
	
	//we need a way to add values of above properties object by object
	// we need one word to access every object hence we use this keyword
	
	Student(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	void greeting() {
		System.out.println("Hello my name is: "+name);

	}
	
	void change(String n) {
		name = n;
	}
	
	
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(10,"pranay",91);
		
		
		System.out.println(s1.id+" "+s1.name+" "+s1.marks);
		s1.greeting();
		
		s1.change("Akash");
		
		System.out.println(s1.id+" "+s1.name+" "+s1.marks);
		s1.greeting();
		
		
		

	}

}
