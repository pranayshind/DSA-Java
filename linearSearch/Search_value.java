package linearSearch;

//return true if given value is present in array

public class Search_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		int target = 20;
		boolean ans =search(arr,target);
		System.out.println(ans);
		
		

	}
	
	static boolean search(int[] arr,int target) {
		if(arr.length==0) {
			System.out.println("given element is not present in array becuase array is empty");
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		return false;
		
	}

}
