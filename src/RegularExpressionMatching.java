
public class RegularExpressionMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMatch("abcdeeeehhhhh","abcde*"));
	}

	public static boolean isMatch(String s,String p){
	        if (p.length() == 0)
	            return s.length() == 0;

	        // length == 1 is the case that is easy to forget.
	        // as p is subtracted 2 each time, so if original
	        // p is odd, then finally it will face the length 1
	        if (p.length() == 1)
	            return (s.length() == 1) && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');

	        // next char is not '*': must match current character
	        if (p.charAt(1) != '*') {
	            if (s.length() == 0)
	                return false;
	            else
	                return (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')
	                        && isMatch(s.substring(1), p.substring(1));
	        }else{
	            // next char is *
	            while (s.length() > 0 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
	                if (isMatch(s, p.substring(2))) {
	                    return true;
	                }
	                s = s.substring(1);
	            }
	            return isMatch(s, p.substring(2));
	        }
	}
}
