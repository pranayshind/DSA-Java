package linearSearch;
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
//Example 2:
//
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10
//Explanation: 
//1st customer has wealth = 6
//2nd customer has wealth = 10 
//3rd customer has wealth = 8
//The 2nd customer is the richest with a wealth of 10.

public class Max_Wealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,5},{7,3},{3,5}};
		int ans = maximumWealth(arr);
		System.out.println("maximum walth: "+ans);
		

	}
	static int maximumWealth(int[][] accounts) {
	        int temp=0;
	       for(int r=0;r<accounts.length;r++){
	           int count=0;
	           for(int c=0;c<accounts[r].length;c++){
	               count+=accounts[r][c];

	           }
	           if(count>temp){
	               temp=count;
	           }
	       }

	       return temp;
	        
	    }

}
