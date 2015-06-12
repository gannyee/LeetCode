public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println(myAtoi("3233333324"));
		System.out.println(myAtoi(""));
		System.out.println(myAtoi("0000000000000000000000000000000001"));
		System.out.println(myAtoi("00004010"));
		System.out.println(myAtoi("+-+234"));
		System.out.println(myAtoi("0012a42"));
		System.out.println(myAtoi("0 213 34"));
		System.out.println(myAtoi("2147483648"));
		System.out.println(myAtoi("-214234"));
		System.out.println(myAtoi("9223372036854775809"));*/
		System.out.println(myAtoi("+-2"));
		System.out.println(myAtoi("-0012a42"));
		System.out.println(myAtoi("-"));
		System.out.println(myAtoi("92233720368547732222222222222222222222222255809"));
		
	}

	public static int myAtoi(String str) {
	       if (str == null || str.length() < 1)
	   		return 0;
	    
	   	// trim white spaces
	   	str = str.trim();
	    
	   	char flag = '+';
	    
	   	// check negative or positive
	   	int i = 0;
	   	if (str.charAt(0) == '-') {
	   		flag = '-';
	   		i++;
	   	} else if (str.charAt(0) == '+') {
	   		i++;
	   	}
	   	// use double to store result
	   	double result = 0;
	    
	   	// calculate value
	   	while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
	   		result = result * 10 + (str.charAt(i) - '0');
	   		i++;
	   	}
	    
	   	if (flag == '-')
	   		result = -result;
	    
	   	// handle max and min
	   	if (result > Integer.MAX_VALUE)
	   		return Integer.MAX_VALUE;
	    
	   	if (result < Integer.MIN_VALUE)
	   		return Integer.MIN_VALUE;
	    
	   	return (int) result;
			
		/*str = str.replaceAll(" ", "");
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))){
				str = str.substring(0,i);
			}
		}
		int count = 0;
		int flag = 0;
		double res = 0;
		if (str.equals("") ||(str.length() == 1 && !Character.isDigit(str.charAt(0)))) {
			return 0;
		}
		while (str.startsWith("0") && str.length() > 1) {
			str = str.substring(1);
		}
		if ((str.length() == 1 && str.equals("0"))) {
			return 0;
		} else if (str.length() == 1) {
			return Integer.parseInt(str);
		}
		
		if(str.substring(0,2).equals("+-") || str.substring(0,2).equals("-+")){
			
		    return 0;
		}
		
		while (str.startsWith("+") || str.startsWith("-")) {
			if (str.startsWith("-")) {
				count += 1;
				flag = 1;
				str = str.substring(1);
			} else if (str.startsWith("+")) {
				flag = 0;
				str = str.substring(1);
			}
		}
		
		
		if ((flag == 1 && count % 2 == 0) || (flag == 0 && count == 0)) {
			
			res = Double.parseDouble(str);
			flag = 0;
		} else if (flag == 1 && count % 2 != 0) {
			res = 0 - Double.parseDouble(str);

		}

		if (res >= Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		else if (res <= Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		} else if (flag == 0) {
			return Integer.parseInt(str);
		} else {
			return (0 - Integer.parseInt(str));
		}*/
	}
}
