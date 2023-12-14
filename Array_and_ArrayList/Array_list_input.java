package Array_and_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new  Scanner(System.in);
		System.out.println("Enter size of arrayList: ");
		int size = in.nextInt();
		ArrayList<Integer> l = new ArrayList<>(size);
		System.out.println("Enter elements of arrayList: ");
		//input
		for(int i=0;i<size;i++) {
			l.add(in.nextInt());
		}
		
		//output
		//1st way of printing o/p
		System.out.println(l);
		//2nd way of printing o/p
		for(int i=0;i<size;i++) {
			System.out.println(l.get(i));;
		}
		

	}

}
