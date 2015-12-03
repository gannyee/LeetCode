
public class CountandSay {

	public static void main(String[] args) {
		
		System.out.println(countAndSay(6));
	}

	public static String countAndSay(int n) {
		String newS = "1";
		int count = 1;
		int i = 1;
		while (i < n) {
			String s = newS;
			newS = "";
			for (int j = 0; j < s.length(); j++) {
				if ((j + 1) < s.length() && s.charAt(j) == s.charAt(j + 1)) {
					count++;
				} else {
					newS = newS + count + s.charAt(j);
					count = 1;
				}
			}
			i++;
		}
		return newS;
	}

}
