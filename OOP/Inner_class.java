package OOP;

public class Inner_class {
	
	static class in{
		String name;
		in(String name){
			this.name=name;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		in obj = new in("pranay");
		in obj1 = new in("raj");
		System.out.println(obj.name);
		System.out.println(obj1.name);

	}

}
