/**
 * Given a string S, find the longest palindromic 
 * substring in S. You may assume that the maximum 
 * length of S is 1000, and there exists one unique 
 * longest palindromic substring.
 * @author ganyee
 *
 */
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("asdfg "));
	}

	 public static String longestPalindrome(String s) {
		 	String maxStr = "";
		 	for(int i = s.length();i >= 0;i --){
		 		maxStr = isPalindrom(s, i);
		 		if(maxStr.length() !=0)
		 			break;
		 	}
	        return maxStr;
	    }
	 
	 public static String isPalindrom(String s,int len){
		 int i = 0;
		 StringBuffer str = new StringBuffer(s);
		 String str1;
		 String str2;
		 String str3 = "";
		 while(i + len <= s.length()){
			 str1 = str.substring(i,i + len).toString();
			 StringBuffer str4 = new StringBuffer(str1);
			 str2 = str4.reverse().toString();
			 if(str1.equals(str2) && str3.length() < str1.length()){
				 str3 = str1;
				 break;
			 }
			 else{
				 i ++;
			 }
		 }
		 return str3;
	 }
}
