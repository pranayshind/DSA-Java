package Array_and_ArrayList;

import java.util.ArrayList;

//ArrayList is usefful when we dont know size of an array

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(14);
		l.add(40);
		l.add(4);
		l.add(140);
		l.add(470);
		l.add(40);
		
		System.out.println(l);
		l.set(0,99);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}

	}

}
