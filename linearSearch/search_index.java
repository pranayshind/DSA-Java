package linearSearch;

//search index of element in array

public class search_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		int target = 20;
		
		int ans = search(arr,target);
		if(ans==-1) {
			System.out.println("given element is not present in array ");
		}
		else {
			System.out.println("index: "+ans);
		}

	}
	
	static int search(int[] arr,int target) {
		
		if(arr.length==0) {
			System.out.println("given element is not present in array becuase array is empty");
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
