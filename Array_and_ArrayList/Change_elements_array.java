package Array_and_ArrayList;

import java.util.Arrays;


//arrays are mutable
public class Change_elements_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,20,30,40};
		change(array);
		
		System.out.println(Arrays.toString(array));

	}
	static void change(int arr[]) {
		arr[0]=99;
		
		
	}

}
