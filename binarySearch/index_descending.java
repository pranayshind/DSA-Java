package binarySearch;

public class index_descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {450,104,95,78,75,70,68,64,45,10,8,4,2,-4};
		int target=104;
		int ans = binary(arr,target);
		if(ans==-1) {
			System.out.println("given element is not present in array ");
		}
		else {
			System.out.println("given element  is present in array at index: "+ans);
		}
		

	}
	
	static int binary(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;   //similar to => mid=start+end/2
			if(target<arr[mid]) {
				start=mid+1;
			}
			else if(target>arr[mid]) {
				end=end-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	

}
