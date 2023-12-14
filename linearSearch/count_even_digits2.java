package linearSearch;

public class count_even_digits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,10,104,1478,40,46,124,5,74,-78};   // 6 will output
		int ans = even_count(arr);
		System.out.println("count of even no. of digits in array is: "+ans);

	}
	static int even_count(int[] arr) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i]=arr[i]*-1;  //to handle negative number edge case
			}
			
			int c = (int) (Math.log10(arr[i])+1);
			if(c%2==0) {
				count+=1;
			}
			
		}
		return count;
		
		
		
	}

}
