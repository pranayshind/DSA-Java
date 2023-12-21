package OOP;

class Ex{
	String name;
	int roll;
	private int marks;
	
	Ex(String name,int roll,int marks){
		this.name=name;
		this.roll=roll;
		this.marks=marks;
	}

	//to access private variable marks we create public getMarks() 
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex obj = new Ex("Pranay",45,91);
		System.out.println(obj.name+" "+obj.roll); //obj.marks will give compiletime error because it is private
		System.out.println(obj.name+" "+obj.roll+" "+obj.getMarks());//we can access marks by creating getters and setters
		obj.setMarks(78);//to change marks we use setters
		System.out.println(obj.name+" "+obj.roll+" "+obj.getMarks());

	}

}
