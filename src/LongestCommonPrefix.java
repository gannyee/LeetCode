public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[]{"aabd","aabcd","aaccs","aa"};
		System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs));
		String[] strs1 = new String[]{"a","b"};
		System.out.println("Longest Common Prefix 1: " + longestCommonPrefix(strs1));
		String[] strs2 = new String[]{"",""};
		System.out.println("Longest Common Prefix 2: " + longestCommonPrefix(strs2));
		String[] strs3 = new String[]{"ssa","ssab"};
		System.out.println("Longest Common Prefix 3: " + longestCommonPrefix(strs3));
		String[] strs4 = new String[]{"","b"};
		System.out.println("Longest Common Prefix 4: " + longestCommonPrefix(strs4));
		String[] strs5 = new String[]{"leet","left","leave","leat"};
		System.out.println("Longest Common Prefix 5: " + longestCommonPrefix(strs5));
	}

	public static String longestCommonPrefix(String[] strs) {
		String minStr = "";
		int minLength = Integer.MAX_VALUE;
		
		if(strs.length == 1)
			return strs[0];
		else if(strs.length == 0)
			return "";
		//Find the smallest length
		for(int i = 0;i < strs.length;i ++){
			if(strs[i].length() < minLength){
				minStr = strs[i];
				minLength = strs[i].length();
			}
		}
		
		for(int i = 0;i < strs.length;i ++){
			int j;
			for(j = 0;j < minLength;j ++){
				if(minStr.charAt(j) != strs[i].charAt(j)){
					break;
				}
			}
			if(j < minLength)
				minLength = j;
		}
		return minStr.substring(0,minLength);
	}
}
