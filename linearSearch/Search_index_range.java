package linearSearch;

public class Search_index_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		int target = 20;
		int start_range=1;
		int end_range=3;
		
		int ans = search(arr,start_range,end_range,target);
		System.out.println("index: "+ans);

	}
	
	static int search(int[] arr, int start_range, int end_range, int target) {
		
		if(arr.length==0) {
			System.out.println("given element is not present in array becuase array is empty");
		}
		for(int i=start_range;i<end_range;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
