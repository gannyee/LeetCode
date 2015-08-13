
public class PalindromeNuber {
	public static boolean isPlindrome(int x){
		if(x == 0) {
			x = 0;
		}
		String x1 = "" + x;
		StringBuffer x2 = new StringBuffer(x1); //Save reversed x1;
		
		if(x1.equals(x2.reverse().toString()))
			return true;
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int x = -2147447412;
		System.out.println(isPlindrome(x));
		int x1 = -0000000;
		System.out.println(isPlindrome(x1));
		int x2 = 103423;
		System.out.println(isPlindrome(x2));
		int x3 = -2192;
		System.out.println(isPlindrome(x3));
		int x4 = 00000;
		System.out.println(isPlindrome(x4));
	}
}
