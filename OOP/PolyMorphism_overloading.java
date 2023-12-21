package OOP;

class Example{
	int add(int a,int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	int add(int a, int b, int c,int d) {
		return a+b+c+d;
	}
}

public class PolyMorphism_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj = new Example();
		int ans = obj.add(10,45,5);
		System.out.println(ans);

	}

}
