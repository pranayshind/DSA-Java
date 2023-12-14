
package Array_and_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Two_D_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		ArrayList<ArrayList<Integer>> l = new ArrayList<>();
		
		//initialization
		for(int i=0;i<3;i++) {
			l.add(new ArrayList<>());
		}
		
		//input
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				l.get(i).add(in.nextInt());
			}
		}
		System.out.println(l);
		

	}

}
