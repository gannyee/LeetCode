/**
 * 
 * @author ganyee Reverse digits of an integer. Example1: x = 123, return 321
 *         Example2: x = -123, return -321
 */
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(reverse(10000000));
		// System.out.println(reverse(1534236469));
		System.out.println(reverse(-2147483648));
		System.out.println(reverse(9646351));
	}

	public static int reverse(int x) {
		int flag = 0;
		long newX = x;
		
		//输入时判断是否溢出
		if (newX < 0) {
			newX = Math.abs(newX);
			flag = 1;
		} else {
			newX = x;
		}
		if (newX == 0 || newX > Integer.MAX_VALUE)
			return 0;

		String str = Long.toString(newX);
		StringBuffer stringBuffer = new StringBuffer(str);
		str = stringBuffer.reverse().toString();
		
		//输出是判断是否发生溢出
		if (Long.parseLong(str) > Integer.MAX_VALUE)
			return 0;
		System.out.println(str);
		while (str.startsWith("0")) {
			str = str.substring(1);
		}

		if (flag == 1) {

			return (0 - Integer.parseInt(str));
		} else {
			return Integer.parseInt(str);
		}
	}

}
