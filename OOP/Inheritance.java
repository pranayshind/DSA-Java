package OOP;

class Box{
	double h;
	double l; 
	double w;
//	double weight=45;
	
	//if no arguments were given in main code then this will execute
	Box(){
		this.h=-1;
		this.l=-1;
		this.w=-1;
	}
	
	//if 3 arguments were given inn main code this will execute
	Box(double h, double l, double w){
		this.h= h;
		this.l=l;
		this.w= w;
	}
	
	//if 1 argument is given in main code this will execute
	Box(double  side){
		this.h=side;
		this.l=side;
		this.w=side;
	}
	
	//copy constructor
	Box(Box old){
		this.h=old.h;
		this.l=old.l;
		this.w=old.w;
	}
	
	public void greet() {
		System.out.println("Hello.....");
	}
}

//child class
class BoxWeight extends Box{
	double weight;
	
	//to call 2nd parent class constructor
	public BoxWeight(double h, double l, double w, double weight) {
		super(h, l, w);
		// TODO Auto-generated constructor stub
		this.weight = weight;
	}

//	public BoxWeight() {
//		super();
//		// TODO Auto-generated constructor stub
//		
//		this.weight=super.weight;// super.weigth means weight from from parent class
//		
//	}
//	
	
		
}

class BoxPrice extends BoxWeight{
    double price;
	public BoxPrice(double h, double l, double w, double weight,double price) {
		super(h, l, w, weight);
		// TODO Auto-generated constructor stub
		this.price =price;
	}
	
}
public class Inheritance {
	public static void main(String[] args) {
		
		Box obj1 = new Box();
		System.out.println(obj1.h+" "+obj1.l+" "+obj1.w);
		
		Box obj2 = new Box(10,4,5);
		System.out.println(obj2.h+" "+obj2.l+" "+obj2.w);
		
		Box obj3 = new Box(8);
		System.out.println(obj3.h+" "+obj3.l+" "+obj3.w);
		
		Box obj4 = new Box(obj3);   //copy constructor
		System.out.println(obj4.h+" "+obj4.l+" "+obj4.w);
		
		BoxWeight obj5 = new BoxWeight(10,4,5,7);
		System.out.println(obj5.h+" "+obj5.l+" "+obj5.w+" "+obj5.weight);
		
		//BoxWeight obj6 = new BoxWeight();
		//System.out.println(obj6.h+" "+obj6.l+" "+obj6.w+" "+obj6.weight);
		
		BoxPrice obj7= new BoxPrice(14,5,78,45,400);
		System.out.println(obj7.h+" "+obj7.l+" "+obj7.w+" "+obj7.weight+" "+obj7.price);
		
		
		

	}
}
