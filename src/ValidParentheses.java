import java.util.Stack;

public class ValidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str0 = "()({})";  //Match
		String str1 = "()({}) {([()[]])}";//Match
		String str2 = "([]{)";//Not match
		String str3 = ")([()] {}";//Not match
		String str4 = "([())]{}";//Not match
		System.out.println("str0 " + isValid(str0));
		System.out.println("str1 " + isValid(str1));
		System.out.println("str2 " + isValid(str2));
		System.out.println("str3 " + isValid(str3));
		System.out.println("str4 " + isValid(str4));
	}

	public static boolean isValid(String s) {

		if (s.length() % 2 != 0) {
			return false;
		}

		Stack<Character> string = new Stack<Character>();
		char ch;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
				string.push(s.charAt(i));
				//System.out.println(string);
			} else {
				if (string.isEmpty()){
					return false;
				}
				else {
					ch = s.charAt(i);
					switch (ch) {
					case ']':
						if (string.pop() != '[')
							return false;
						break;
					case ')':
						if (string.pop() != '(')
							return false;
						break;
					case '}':
						if (string.pop() != '{')
							return false;
						break;
					}
				}

			}
		}
		if(string.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
}
