package Array_and_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Two_d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new  Scanner(System.in);
		System.out.println("Enter rows of array: ");
		int  r = in.nextInt();
		System.out.println("Enter columns of array: ");
		int c = in.nextInt();
		int[][] arr =  new int[r][c];
		System.out.println("Enetr elements of array: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=in.nextInt();
			}
		}
		
		//1st way-->
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//2nd way-->
		for(int i=0;i<r;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
