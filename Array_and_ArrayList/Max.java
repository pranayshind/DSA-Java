package Array_and_ArrayList;

//find max value in array
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {10,45,7,104,40};
		max(arr);

	}
	static void max(int arr[]) {
		int m = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>m) {
				m=arr[i];
			}
		}
		System.out.println(m);
		
	}

}
