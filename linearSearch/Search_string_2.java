package linearSearch;

import java.util.Arrays;

public class Search_string_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Pranay Shinde";
		char target='P';
		
		boolean ans = search(s,target);
		System.out.println(ans);
		
		//to print each element in string
		System.out.println(Arrays.toString(s.toCharArray()));
	

	}

	static boolean search(String s, char target) {
		
		if(s.length()==0) {
			return false;
		}
		for(char i: s.toCharArray()) {   //for each loop
			if(i==target) {
				return true;
			}
		}
		return false;
	}

}
