package linearSearch;

//find minimum number in array

public class Minimum_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,5,40,50};
		int ans = min(arr);
		if(ans==-1) {
			System.out.println("array is empty");
		}
		else {
		System.out.println("minimum number in aray is: " +ans);
		}
	}
	
	static int min(int[] arr) {
		
		if(arr.length==0) {
			return -1;
		}
		
		int min_val=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min_val) {
				min_val = arr[i];
			}
		}
		return min_val;
	}
	

}
