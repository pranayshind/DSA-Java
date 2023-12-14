package linearSearch;

import java.util.Arrays;

public class Search_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{10,24,75},
						{15,40,78,45},
						{10,4}
						};
		int target=24;
		int[] ans = search(arr,target);
		
		System.out.println("index is: "+Arrays.toString(ans));

	}
	static int[] search(int[][] arr,int target) {
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				if(arr[r][c]==target) {
					return new int[] {r,c};
				}
			}
		}
		return new int[] {-1,-1};
	}

}
