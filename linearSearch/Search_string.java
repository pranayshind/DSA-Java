package linearSearch;

//search given character is present in string or not

public class Search_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Pranay Shinde";
		char target='P';
		
		boolean ans = search(s,target);
		System.out.println(ans);
	

	}
	
	static boolean search(String s, char target) {
		
		if(s.length()==0) {
			return false;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==target) {
				return true;
			}
		}
		return false;
	}

}
