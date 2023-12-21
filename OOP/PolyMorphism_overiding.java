package OOP;


class Parent{
	void name(){
		System.out.println("Pranay");
	}
}

class Child extends Parent{
	void name() {
		System.out.println("Shinde");
	}
}
public class PolyMorphism_overiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj = new Child();
		obj.name();

	}

}
