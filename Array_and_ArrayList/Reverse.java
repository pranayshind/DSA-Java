package Array_and_ArrayList;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,40,5,8,7,89,41};
		reverse(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void reverse(int[] arr) {
		
		//2 pointer approach
		int start =0;
		int end = arr.length-1;
		
		while(start<end) {
			int temp=arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
