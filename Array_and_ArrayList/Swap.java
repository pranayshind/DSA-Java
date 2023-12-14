package Array_and_ArrayList;

import java.util.Arrays;

//swap the elements of array as per index input
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,44,5,78};
		
		swap(arr,1,2);
		System.out.println(Arrays.toString(arr));

	}
	
	static void swap(int arr[],int a,int b) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
