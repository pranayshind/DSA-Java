package linearSearch;

//count number of even digit numbers in array

public class count_even_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,10,104,1478,40,46,124,5,74,-78};   // 6 will output
		int ans = even_count(arr);
		System.out.println("count of even no. of digits in array is: "+ans);

	}
	static int even_count(int[] arr) {
		int even_no_count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i]=arr[i]*-1;  //to handle negative number edge case
			}
			
			int count=0;
			while(arr[i]>0) {
				count+=1;
				arr[i]=arr[i]/10;
				}
			
			if(count%2==0) {
				even_no_count+=1;
			}
		}
		return even_no_count;
	}

}
