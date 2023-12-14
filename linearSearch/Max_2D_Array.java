package linearSearch;

public class Max_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{10,24,75},
				{15,40,78,45},
				{10,4}
				};
		int ans = max(arr);
		System.out.println("maximum value inn array is: "+ans);

	}
	
	static int max(int[][] arr) {
		int max_val=Integer.MIN_VALUE;
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				if(arr[r][c]>max_val) {
					max_val=arr[r][c];
				}
			}
		}
		return max_val;
	}

}
