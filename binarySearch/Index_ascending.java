package binarySearch;

//find index of element in array using binarysearch and array is sortedd in ascending order
public class Index_ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-10,-8,-6,0,2,4,6,8,14,16,40,57,70,84,95,104,450};
		int target=4;
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
				end=end-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	

}
