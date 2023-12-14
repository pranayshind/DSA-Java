package Array_and_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Input_PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new  Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = in.nextInt();
		int[] arr =  new int[size];
		System.out.println("Enetr elements of array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = in.nextInt();
		}
		
		//printing elements of array
		
		//1st way-->for loop
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//2nd way-->for each loop
		
		for(int num: arr){
			System.out.print(num+" ");
		}
		System.out.println();
		
		//3rd way-->string array
		System.out.println(Arrays.toString(arr));

	}

}
