package Functtion_methods;

public class Three_digit_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arm();

	}
	
	static void arm(){
		for(int i=100;i<1000;i++) {
			int temp=i;
			int sum=0;
			while(temp>0) {
				int rem = temp%10;
				sum=(int) (sum+Math.pow(rem, 3));
				temp=temp/10;
				
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}

}
